package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private Connection con;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/dbprojeto";
	private String usuario = "root";
	private String senha = "";
	
	public Conexao() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, 
					usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConexao() {
		return con;
	}
}
