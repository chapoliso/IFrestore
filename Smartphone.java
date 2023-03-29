package Produto;

public class Smartphone extends Produto {
	
	private String sistemaOperacional;
    private int capacidadeArmazenamento;
    
    public Smartphone(String nome, double preco, String descricao, double precoVenda, int quantidade) {
		super(nome, preco,descricao,precoVenda,quantidade);
		
	}

	public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }
    
    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    
   
}


