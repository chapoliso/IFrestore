package Produto;

public class Produto {
	
	
	private int codigo;
    private String nome;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidadeEmEstoque;
    // private int dataValidade;
    // private int LocalDate;
    
    public Produto() {
    	
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPrecoCompra() {
        return precoCompra;
    }
    
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }
    
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    public void registrarProduto(String nome, double preco) {
        this.nome = nome;
        this.precoCompra = preco;
    }

    public Produto(String nome, double preco, String descricao, double precoVenda, int quantidade) {
        this.nome = nome;
        this.precoCompra = preco;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.quantidadeEmEstoque = quantidade;
    }

	// public int getDataValidade() {
	//	return dataValidade;
	// }

	// public void setDataValidade(int dataValidade) {
	//	this.dataValidade = dataValidade;
	// }

	// public int getLocalDate() {
	//	return LocalDate;
	// }

	// public void setLocalDate(int localDate) {
	//	LocalDate = localDate;
	// }
}

