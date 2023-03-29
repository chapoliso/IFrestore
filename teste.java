package Produto;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {
		
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		Caixa caixa = new Caixa();	
		Notebook n = new Notebook();
		
		listaProdutos.add(n);
		
		
        n.setCodigo(1);
        n.setNome("Dell");
        n.setDescricao("Notebook Dell");
        n.setPrecoCompra(2500.00);
        n.setPrecoVenda(3500.00);
        n.setQuantidadeEmEstoque(10);
        n.setMemoriaRAM(8);
        n.setProcessador("i3");
        
        System.out.println("-------------------------------");
        System.out.println("Código: " + n.getCodigo());
        System.out.println("Nome: " + n.getNome());
        System.out.println("Descrição: " + n.getDescricao());
        System.out.println("Preço de compra: " + n.getPrecoCompra());
        System.out.println("Preço de venda: " + n.getPrecoVenda());
        System.out.println("Quantidade em estoque: " + n.getQuantidadeEmEstoque());
        System.out.println("Memória RAM: " + n.getMemoriaRAM() + "GB");
        System.out.println("Processador: " + n.getProcessador());
        System.out.println("-------------------------------");
        
        caixa.comprarProduto(n, 11);
		
	}
}