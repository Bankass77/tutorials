package certification.tutorials.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercice6 {

	public static void main(String[] args) {

		String sql = "SELECT * FROM customer order by username";
		Statement statement;
		Connection connection;

		try {
			connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				Long id = resultSet.getLong("CUSTOMER_ID");
				String username = resultSet.getString("USERNAME");
				String firstName = resultSet.getString("FIRST_NAME");
				String lastName = resultSet.getString("LAST_NAME");

				System.out.println(id + " " + username + " " + firstName + " " + lastName);
			}

			if (resultSet != null) {
				resultSet.close();

			}

			if (statement != null) {
				statement.close();
			}

			connection.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
