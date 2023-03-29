package Produto;

public class Tablet extends Produto {
	
	private String tipoTela;
    private int tamanhoTela;
    
    public Tablet(String nome, int preco, String descricao, int precoVenda, int quantidade) {
		super(nome, preco,descricao,precoVenda,quantidade);
	}

	public String getTipoTela() {
        return tipoTela;
    }
    
    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }
    
    public int getTamanhoTela() {
        return tamanhoTela;
    }
    
    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

}
