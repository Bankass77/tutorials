package certification.tutorials.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test1 {

	public static void main(String[] args) throws SQLException {
		var sql = "SELECT num FROM counts WHERE num> ?";
		Connection conn= DriverManager.getConnection(sql);
		try (var ps = conn.prepareStatement(sql,
		   ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
		   ps.setInt(1, 3);

		   try (var rs = ps.executeQuery()) {
		   while (rs.next())
		      System.out.println(rs.getObject(1));
		   }

		    ps.setInt(1, 100);

		    try (var rs = ps.executeQuery()) {
		      while (rs.next())
		         System.out.println(rs.getObject(1));
		    }
		}

	}

}
