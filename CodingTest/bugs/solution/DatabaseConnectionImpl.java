package solution;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnectionImpl implements DatabaseConnection {
	private static Connection instance = null;

	public Connection getConnection () {
		if (DatabaseConnectionImpl.instance == null) {
			DatabaseConnectionImpl.instance = createConnection()
		}
		return DatabaseConnectionImpl.instance
	}

	private Connection createConnection() {
		String databaseConfigProps = System.env['DATABASE_CONFIG_PROPS_POSTGRES']
		String username = System.env['USERNAME_POSTGRES']
		String password = System.env['PASSWORD_POSTGRES']
		return DriverManager.getConnection(databaseConfigProps, username, password);
	}
}
