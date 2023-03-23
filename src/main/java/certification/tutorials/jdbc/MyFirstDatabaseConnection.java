package certification.tutorials.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.HashMap;

public class MyFirstDatabaseConnection {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:hsqldb:file:zoo";

		Connection conn = DriverManager.getConnection(url);

		var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
		var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
		var deleteSql = "DELETE FROM exhibits WHERE id = 10";

		// Reading Data with executeQuery()
		try (var connection = DriverManager.getConnection(url);
				var preparedStatement = connection.prepareStatement("SELECT name From exhibits",
						ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

				ResultSet resultSet = preparedStatement.executeQuery()) {

			while (resultSet.next()) {

				System.out.println(resultSet.getString(1));
			}
		}

		var selectSql = "SELECT * FROM exhibits";

		try (var ps = conn.prepareCall(selectSql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {

			ResultSet result = ps.executeQuery();
			{

				System.out.println(result);
			}
		}

		// Processing data with execute

		PreparedStatement ps = conn.prepareStatement(insertSql);

		boolean isResult = ps.execute();

		if (isResult) {

			try (ResultSet rs = ps.getResultSet()) {

				System.out.println(rs + "ran a query");
			}
		} else {

			int result = ps.getUpdateCount();
			System.out.println(result + ": ran an update");
		}

		var sql = "SELECT * FROM names";

		/*
		 * try (var ps2 = conn.prepareStatement(sql)) {
		 * 
		 * var result = ps2.executeUpdate();
		 * 
		 * System.out.println(result); }
		 */

		// Batching Statements
		register(conn, 100, 1, "Elias", "Ester");

		// Getting Data from a ResultSet

		var sql2 = "SELECT id, name FROM exhibits";
		var sql3 = "SELECT count(*) AS count FROM exhibits";

		var idToNameMap = new HashMap<Integer, String>();
		try (var ps3 = conn.prepareStatement(sql2); ResultSet rs = ps3.executeQuery()) {

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				idToNameMap.put(id, name);

			}
			System.out.println(idToNameMap);
		}
		/*
		 * try(var ps4= conn.prepareStatement(sql3); ResultSet rs= ps4.executeQuery()){
		 * 
		 * if (rs.next()) {
		 * 
		 * var count= rs.getInt("total"); System.out.println(count);
		 * 
		 * } }
		 */

		/*
		 * var sql5 = "SELECT id FROM exhibits WHERE name = ?";
		 * 
		 * 
		 * try(var ps5=conn.prepareStatement(sql5)){
		 * 
		 * ps5.setString(1,"Zebra");
		 * 
		 * try( var rs = ps5.executeUpdate()){
		 * 
		 * while(rs.next()) {
		 * 
		 * int id= rs.getInt("id"); System.out.println(id); } } }
		 */

		// Calling a Procedure without Parameters
		String sql6 = "{call read_e_names()}";

		try (CallableStatement cs = conn.prepareCall(sql6); ResultSet rs = cs.executeQuery()) {

			while (rs.next()) {
				System.out.println("{call read_e_names()}:" + rs.getString(3));
			}
		}

		// Passing an IN Parameter

		/*
		 * var sql7= "{call read_names_by_letter(?)}";
		 * 
		 * 
		 * try(var cs= conn.prepareCall(sql7)){ cs.setString("prefix", "Z");
		 * 
		 * try(var rs=cs.executeUpdate()){
		 * 
		 * while(rs.next()) {
		 * 
		 * System.out.println(rs.getString(3)); } }
		 * 
		 * }
		 */

		// Returning an OUT Parameter

		var sql8 = "{?= call magic_number(?)}";

		try (var cs = conn.prepareCall(sql8)) {

			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			System.out.println(cs.getInt("num"));
		}

		// Working with an INOUT Parameter
		var sql9 = "{call double_number(?)}";

		try (var cs = conn.prepareCall(sql9)) {

			cs.setInt(1, 8);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			System.out.println(cs.getInt("num"));
		}

		// Committing and Rolling Back

		conn.setAutoCommit(false);

		var elephantRowUpdated = updateRow(conn, 5, "African Elephant");

		var zebraRowsUpdated = updateRow(conn, -5, "Zebra");

		if (!elephantRowUpdated || !zebraRowsUpdated) {

			conn.rollback();
		} else {

			String selectSql2 = """

					SELECT COUNT(*)
					FROM exhibits
					WHERE num_acres <=0
					""";

			try (PreparedStatement ps1 = conn.prepareStatement(selectSql2); ResultSet rs = ps1.executeQuery()) {

				rs.next();
				int count = rs.getInt(1);
				if (count == 0) {
					conn.commit();
				}
			}
		}

		conn.rollback();

	}

	private static boolean updateRow(Connection conn, int i, String string) throws SQLException {

		String updateSql = """
				UPDATE exhibits
				SET num_acres= num_acres + ?
				WHERE name= ?""";

		try (PreparedStatement ps = conn.prepareStatement(updateSql)) {

			ps.setInt(1, i);
			ps.setString(2, string);

			return ps.executeUpdate() > 0;
		}

	}

	// Working withn Parameters

	public static void register(Connection conn) throws SQLException {

		var sql = "INSERT INTO names  VALUES(6, 1, 'Edithg')";

		try (var ps = conn.prepareStatement(sql)) {
			ps.executeUpdate();
		}
	}

	public static void register(Connection conn, int key, int type, String name) throws SQLException {

		var sql = "INSERT INTO names  VALUES(?, ?, ?)";

		try (PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, key);
			ps.setInt(2, type);
			ps.setString(3, name);

			ps.executeUpdate();

		}

		// Suppose we get two new elephants and want to add both. We can use the same
		// PreparedStatement object.

		try (var ps2 = conn.prepareStatement(sql)) {

			ps2.setInt(1, 20);
			ps2.setInt(2, 1);
			ps2.setString(3, "Ester");

			ps2.executeUpdate();

			ps2.setInt(1, 21);

			ps2.setString(3, "Elias");

			ps2.executeUpdate();
		}
	}

	// Batching Statements
	public static void register(Connection connection, int firstKey, int type, String... names) throws SQLException {

		var sql = "INSERT  INTO names VALUES(?,?,?)";

		var nextIndex = firstKey;

		try (var ps = connection.prepareStatement(sql)) {

			ps.setInt(2, type);
			for (var name : names) {

				ps.setInt(1, nextIndex);

				ps.setString(3, name);
				ps.addBatch();
				nextIndex++;

			}
			int[] result = ps.executeBatch();

			System.out.println("Result batch:" + Arrays.toString(result));
		}

	}

}
