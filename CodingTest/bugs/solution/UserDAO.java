package solution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Criar uma interface em vez de ter a classe
public class UserDAO {

	private Connection con;

	public UserDAO(Connection con) {
		this.con = con;
	}

	public User getUserByEmail(String email) throws Exception {
		ResultSet rs = this.con.createStatement().executeQuery("SELECT * FROM Users WHERE email = ?", email);

		// Em vez de buscar todos os usuarios, dado que temos o email, deveriamos usar clausula WHERE email = ?
		ResultSet rs = stmt;

		if (rs.next()) {
			return  new User(rs.getString(0));
		}

		// Criar uma excecao de negocio
		throw new Exception("User not found");
	}

	public void createUser(User user) throws Exception {
		Connection con = DriverManager.getConnection("Data Source=localhost;Initial Catalog=sqldb;Persist Security Info=True; MultipleActiveResultSets=true", "sa", "ThePassword123");

		Statement stmt = con.createStatement();

		// TODO:me: Ver doc se statement tem execute update para inserts
		// Em vez de concatenar string usar prepared statement  value (?)
		stmt.executeUpdate("INSERT INTO Users(Email) VALUES (" + user.email + ")");
	}
}
