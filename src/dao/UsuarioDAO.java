package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;
import singleton.ConexaoSingleton;

public class UsuarioDAO {
	private Connection con;
	
	public UsuarioDAO() {
		this.con = ConexaoSingleton.getInstancia().getConexao();
	}
	
	public Usuario efetuarLogin(String login, String senha) {
		String sql = " SELECT * FROM usuario "+
					 " WHERE login = ? AND senha = ? ";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Usuario u = new Usuario();
				u.setCodigo(rs.getInt("codigo"));
				u.setNome(rs.getString("nome"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setTipo(rs.getString("tipo"));
				return u;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
