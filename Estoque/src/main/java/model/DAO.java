package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	
	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://localhost:3306/BancoInventario?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "j199v487";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Adiciona produto.
	 *
	 * @param produto the produto
	 */
	public void adicionaProduto(JavaBeans produto) {
		String adiciona = "INSERT INTO Produtos (nome, preco, quantidade_estoque) VALUES (?, ?, ?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(adiciona);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getPreco());
			pst.setString(3, produto.getQuantidade_estoque());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Listar produtos.
	 *
	 * @return the array list
	 */
	public ArrayList<JavaBeans> listarProdutos() {
		ArrayList<JavaBeans> produtos = new ArrayList<>();
		String ler = "SELECT * FROM Produtos";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(ler);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String preco = rs.getString(3);
				String quantidade_estoque = rs.getString(4);
				produtos.add(new JavaBeans(id, nome, preco, quantidade_estoque));
			}
			con.close();
			return produtos;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Seleciona produto.
	 *
	 * @param produto the produto
	 */
	public void selecionaProduto(JavaBeans produto) {
		String ler2 = "SELECT * FROM Produtos WHERE id = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(ler2);
			pst.setString(1, produto.getId());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				produto.setId(rs.getString(1));
				produto.setNome(rs.getString(2));
				produto.setPreco(rs.getString(3));
				produto.setQuantidade_estoque(rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Altera produto.
	 *
	 * @param produto the produto
	 */
	public void alteraProduto(JavaBeans produto) {
		String cria = "UPDATE Produtos SET nome = ?, preco = ?, quantidade_estoque = ? WHERE id = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(cria);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getPreco());
			pst.setString(3, produto.getQuantidade_estoque());
			pst.setString(4, produto.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Deleta produto.
	 *
	 * @param produto the produto
	 */
	public void deletaProduto(JavaBeans produto) {
		String deleta = "DELETE FROM Produtos WHERE id = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(deleta);
			pst.setString(1, produto.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
