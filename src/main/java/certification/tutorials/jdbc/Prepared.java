package certification.tutorials.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prepared {

	public static void main(String[] args) {

		Connection connection = null;

		PreparedStatement preparedStatement = null;

		String sql = "UPDATE email " + "SET EMAIL_ADDRESS = ? " + "WHERE customer_id = ? " + "AND email_type = ? ";

		try {
			connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			connection.setAutoCommit(false);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "bob.marley@another_company.com");
			preparedStatement.setLong(2, 1L);
			preparedStatement.setString(3, "WORK");

			int rowsChanged = preparedStatement.executeUpdate();
			connection.commit();
			System.out.println("Number rows changed: " + rowsChanged);
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				if (connection != null) {
					connection.rollback();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			} finally {
				try {
					connection.setAutoCommit(true);

					if (preparedStatement != null) {
						preparedStatement.close();
					}

					connection.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}

	}

}
