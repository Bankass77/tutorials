package certification.tutorials.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DerbyUtil {

	public static void dropTablesIfExist(String url, String... tables) throws SQLException {
		try (var conn = DriverManager.getConnection(url)) {
			for (String table : tables) {
				try (PreparedStatement ps = conn.prepareStatement("DROP TABLE " + table)) {
					ps.executeUpdate();
				} catch (SQLException e) {
					// ignore exceptions on drop since table might not exist
				}
			}
		}
	}

	public static void run(String url, String... sqlStatements) throws SQLException {
		try (var conn = DriverManager.getConnection(url)) {
			for (String stmt : sqlStatements) {
				try (PreparedStatement ps = conn.prepareStatement(stmt)) {
					ps.executeUpdate();
				}
			}
		}
	}

	public static void outputTable(String url, String tableName) throws SQLException {
		String sql = "SELECT * FROM " + tableName;
		try (var conn = DriverManager.getConnection(url);
				var ps = conn.prepareStatement(sql);
				var rs = ps.executeQuery()) {

			var metadata = rs.getMetaData();
			int numColumns = metadata.getColumnCount();

			while (rs.next()) {
				outputRow(rs, numColumns);
			}
		}
	}

	private static void outputRow(ResultSet rs, int numColumns) throws SQLException {
		for (int i = 1; i <= numColumns; i++) {
			System.out.print(rs.getString(i));
			System.out.print('\t');
		}
		System.out.println();
	}

}
