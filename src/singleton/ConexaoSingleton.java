package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSingleton {
	private static ConexaoSingleton instancia;
	private Connection con;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/dbprojeto";
	private String usuario = "root";
	private String senha = "";
	
	public ConexaoSingleton() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static synchronized ConexaoSingleton getInstancia() {
		if (instancia == null) {
			instancia = new ConexaoSingleton();
		}
		return instancia;
	}
	
	public Connection getConexao() {
		return con;
	}
}
