package Produto;

import java.util.ArrayList;

public class controleEstoque {
	 private ArrayList<Produto> produtos;

	  public controleEstoque() {
	    produtos = new ArrayList<Produto>();
	  }

	  
	  public void registrarProduto(String nome, double preco) {
	    Produto produto = new Produto();
	    produto.setNome(nome);
	    produto.setPrecoVenda(preco);
	    produtos.add(produto);
	  }
	  
	  public Produto buscarProduto(String nome) {
	        for (Produto produto : this.produtos) {
	            if (produto.getNome().equals(nome)) {
	                return produto;
	            }
	        }
	        return null; 
	    }


}
