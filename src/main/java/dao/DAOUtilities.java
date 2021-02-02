package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Class used to retrieve DAO Implementations. Serves as a factory.
 * 
 */
public class DAOUtilities {

	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "password";
	private static final String URL = "jdbc:postgresql://localhost:5432/eZoo";

	private static CheckingsDaoImpl checkingsDaoImpl;
	private static SavingsDaoImpl savingsDaoImpl;
	private static Connection connection;

	public static synchronized CheckingsDAO getCheckingsDao() {

		if (checkingsDaoImpl == null) {
			checkingsDaoImpl = new CheckingsDaoImpl();
		}
		return checkingsDaoImpl;
	}

	public static synchronized SavingsDAO getSavingsDao() {

		if (savingsDaoImpl == null) {
			savingsDaoImpl = new SavingsDaoImpl();
		}
		return savingsDaoImpl;
	}

	static synchronized Connection getConnection() throws SQLException {
		if (connection == null) {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Could not register driver!");
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}

		// If connection was closed then retrieve a new connection
		if (connection.isClosed()) {
			System.out.println("getting new connection...");
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		return connection;
	}

}
