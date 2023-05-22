package certification.tutorials.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.HashMap;

public class SetupHsqlDatabase {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:hsqldb:file:zoo";
		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {

			var elephanRowtUpdate = updateRow(conn, 5, "African Elephant");

			var zebraRowUpdated = updateRow(conn, -5, "Zebra");

			if (!zebraRowUpdated || !elephanRowtUpdate) {

				conn.rollback();
			} else {

				String selectSql = """
						SELECT COUNT (*)
						FROM exhibits
						WHERE num_acres <=0
						""";
				try (PreparedStatement ps = conn.prepareStatement(selectSql)) {

					ResultSet rs = ps.executeQuery();

					rs.next();

					int count = rs.getInt(1);
					if (count == 0) {

						conn.commit();
					} else {

						conn.rollback();
					}
				}
			}

			run(conn, "DROP PROCEDURE read_e_names IF EXISTS");
			run(conn, "DROP PROCEDURE read_names_by_letter IF 			EXISTS");
			run(conn, "DROP PROCEDURE magic_number IF EXISTS");
			run(conn, "DROP PROCEDURE double_number IF EXISTS");
			run(conn, "DROP TABLE names IF EXISTS");
			run(conn, "DROP TABLE exhibits IF EXISTS");

			run(conn, "CREATE TABLE exhibits (" + "id INTEGER PRIMARY KEY, " + "name VARCHAR(255), "
					+ "num_acres DECIMAL(4,1))");

			run(conn, "CREATE TABLE names (" + "id INTEGER PRIMARY KEY, "
					+ "species_id integer REFERENCES exhibits (id), " + "name VARCHAR(255))");

			run(conn, "INSERT INTO exhibits VALUES (1, 'African Elephant', 7.5)");
			run(conn, "INSERT INTO exhibits VALUES (2, 'Zebra', 1.2)");

			run(conn, "INSERT INTO names VALUES (1, 1, 'Elsa')");
			run(conn, "INSERT INTO names VALUES (2, 2, 'Zelda')");
			run(conn, "INSERT INTO names VALUES (3, 1, 'Ester')");
			run(conn, "INSERT INTO names VALUES (4, 1, 'Eddie')");
			run(conn, "INSERT			 INTO names VALUES (5, 2, 'Zoe')");

			String noParams = "CREATE PROCEDURE read_e_names() " + "READS SQL DATA DYNAMIC RESULT SETS 1 "
					+ "BEGIN ATOMIC "
					+ "DECLARE result CURSOR WITH RETURN FOR SELECT * FROM names WHERE name LIKE 'e%'; "
					+ "OPEN result; " + "END";

			String inParam = "CREATE PROCEDURE read_names_by_letter(IN prefix VARCHAR(10)) "
					+ "READS SQL DATA DYNAMIC RESULT SETS 1 " + "BEGIN ATOMIC "
					+ "DECLARE result CURSOR WITH RETURN FOR "
					+ " SELECT * FROM namezebraRowUpdateds WHERE name LIKE CONCAT(prefix, '%'); " + "OPEN result; "
					+ "END";

			String inOutParam = "CREATE PROCEDURE double_number(INOUT num INT) READS SQL DATA\n"
					+ "  DYNAMIC RESULT SETS 1 " + "  BEGIN ATOMIC " + "  SET num = num * 2; " + "  END";

			String outParam = "CREATE PROCEDURE magic_number(OUT num INT) READS SQL DATA\n" + "  BEGIN ATOMIC "
					+ "  SET num = 42;" + "  END";

			run(conn, noParams);
			run(conn, inParam);
			run(conn, outParam);
			run(conn, inOutParam);

			var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
			var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
			var deleteSql = "DELETE FROM exhibits WHERE id = 10";
			run(conn, insertSql);

			run(conn, updateSql);

			run(conn, deleteSql);

			// Reading a ResultSet

			String sql = "SELECT id, name FROM exhibits";
			run(conn, sql);

			// end: Reading a ResultSet

			var sql2 = "SELECT * FROM exhibits where name='Not in table'";
			run(conn, sql2);

			// Getting Data for a column

			var sql3 = "SELECT id, name FROM exhibits";

			run(conn, sql3);

			// Using Bing Variables

			var sql4 = " SELECT id FROM exhibits WHERE name= ?";
			run(conn, sql4);

			// Calling a Procedure whithouzebraRowUpdatedt Parameters

			String sql5 = "{call read_e_names()}";

			run(conn, sql5);

			// Passing an IN parameter

			var sql6 = "{call read_names_by_letter(?)";

			run(conn, sql6);

			// Returning an OUT Parameter

			var sql7 = "{ ?= call magic_number(?)}";
			run(conn, sql7);

		 printCount(conn, "SELECT count(*) FROM names");
		}
	}

	private static boolean updateRow(Connection conn, int numToAdd, String name) throws SQLException {

		String updateSql = """
				UPDATE exhibits
				SET num_acres= num_acres + ?
				WHERE name= ?
				""";

		try (PreparedStatement ps = conn.prepareStatement(updateSql)) {

			ps.setInt(1, numToAdd);
			ps.setString(2, name);
			return ps.executeUpdate() > 0;

		}
	}

	private static void run(Connection conn, String sql) throws SQLException {
		try (PreparedStatement ps = conn.prepareStatement(sql)) {

			int result = ps.executeUpdate();
			System.out.println(result);

			// Reading a ResultSet

			ResultSet rs = ps.executeQuery();

			var idToNameToMap = new HashMap<Integer, String>();

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				idToNameToMap.put(id, name);
			}

			System.out.println(idToNameToMap);

			rs.next();
			rs.getInt(1); // SQLException

			// Getting Data for a column

			while (rs.next()) {

				Object idField = rs.getObject("id");

				Object nameField = rs.getObject("name");

				if (idField instanceof Integer id) {
					System.out.println(id);

				}

				if (nameField instanceof String name) {

					System.out.println(name);
				}
			}

			ps.setString(1, "Zebra");

			try (var rs2 = ps.executeQuery()) {

				while (rs2.next()) {

					int id = rs2.getInt("id");

					System.out.println(id);
				}
			}

		}
	}

	private static void printCount(Connection conn, String sql) throws SQLException {

		try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

			rs.next();
			System.out.println(rs.getInt(1));
		}

		try (CallableStatement cs = conn.prepareCall(sql); ResultSet rs = cs.executeQuery()) {

			while (rs.next()) {

				System.out.println(rs.getString(3));
			}

		}

		try (var cs = conn.prepareCall(sql)) {

			cs.setString("prefix", "Z");

			try (var rs = cs.executeQuery()) {

				while (rs.next()) {

					System.out.println(rs.getString(3));
				}
			}
		}

		// Returning OUT Parameter

		try (var cs = conn.prepareCall(sql)) {

			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			System.out.println(cs.getInt("num"));

		}

	}

}
