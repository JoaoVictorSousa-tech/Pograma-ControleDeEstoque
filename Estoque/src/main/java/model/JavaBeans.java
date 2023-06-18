package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The id. */
	private String id;
	
	/** The nome. */
	private String nome;
	
	/** The preco. */
	private String preco;
	
	/** The quantidade estoque. */
	private String quantidade_estoque;

	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans() {
		super();

	}

	/**
	 * Instantiates a new java beans.
	 *
	 * @param id the id
	 * @param nome the nome
	 * @param preco the preco
	 * @param quantidade_estoque the quantidade estoque
	 */
	public JavaBeans(String id, String nome, String preco, String quantidade_estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade_estoque = quantidade_estoque;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Gets the preco.
	 *
	 * @return the preco
	 */
	public String getPreco() {
		return preco;
	}

	/**
	 * Sets the preco.
	 *
	 * @param preco the new preco
	 */
	public void setPreco(String preco) {
		this.preco = preco;
	}

	/**
	 * Gets the quantidade estoque.
	 *
	 * @return the quantidade estoque
	 */
	public String getQuantidade_estoque() {
		return quantidade_estoque;
	}

	/**
	 * Sets the quantidade estoque.
	 *
	 * @param quantidade_estoque the new quantidade estoque
	 */
	public void setQuantidade_estoque(String quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}
}
