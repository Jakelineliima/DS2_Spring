package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.Conexao;
import model.Produto;
import singleton.ConexaoSingleton;

public class ProdutoDAO {
	private Connection con;
	
	public ProdutoDAO() {
		//Conexao c = new Conexao();
		//con = c.getConexao();
		
		con = ConexaoSingleton.getInstancia().getConexao();
	}
	
	public String salvar(Produto p) {
		String sql;
		if (p.getCodigo() > 0) {
			sql = " UPDATE produto SET nome = ?, quantidade = ?, "+
		          " valor = ? WHERE codigo = ? ";
		} else {
			sql = " INSERT INTO produto (nome, quantidade, valor) "+
	              " VALUES (?,?,?) ";
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setDouble(2, p.getQuantidade());
			ps.setDouble(3, p.getValor());
			if (p.getCodigo() > 0)
				ps.setInt(4, p.getCodigo());
			ps.executeUpdate();
			ps.close();			
			return "Produto gravado!";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		} 
	}
	
	public List<Produto> listarTodos() {
		List<Produto> listaProdutos = new ArrayList<>();
		String sql = " SELECT * FROM produto ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codigo"));
				p.setNome(rs.getString("nome"));
				p.setQuantidade(rs.getDouble("quantidade"));
				p.setValor(rs.getDouble("valor"));
				listaProdutos.add(p);
			}
			ps.close();
			return listaProdutos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Produto getProdutoPorCodigo(int codigo) {
		String sql = " SELECT * FROM produto "+
					 " WHERE codigo = ? ";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Produto p = new Produto();
			p.setCodigo(rs.getInt("codigo"));
			p.setNome(rs.getString("nome"));
			p.setQuantidade(rs.getDouble("quantidade"));
			p.setValor(rs.getDouble("valor"));
			ps.close();
			return p;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public List<Produto> getProdutosPorNome(String nome) {
		List<Produto> listaProdutos = new ArrayList<>();
		String sql = " SELECT * FROM produto WHERE nome LIKE ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, '%'+ nome +'%');
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Produto p = new Produto();
				p.setCodigo(rs.getInt("codigo"));
				p.setNome(rs.getString("nome"));
				p.setQuantidade(rs.getDouble("quantidade"));
				p.setValor(rs.getDouble("valor"));
				listaProdutos.add(p);
			}
			ps.close();
			return listaProdutos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String excluir(int codigo) {
		String sql = " DELETE FROM produto WHERE codigo = ? ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.executeUpdate();
			ps.close();
			return "Produto excluído!";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Erro: "+ e.getMessage();
		}
	}
}
