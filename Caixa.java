package Produto;

 
public class Caixa {
	
	public void comprarProduto(Produto produto, int quantidade) {
        double valorTotal = produto.getPrecoVenda() * quantidade;
        int quantidadeEstoque = produto.getQuantidadeEmEstoque();

        if (quantidade <= quantidadeEstoque) {
            produto.setQuantidadeEmEstoque(quantidadeEstoque - quantidade);
            System.out.println("-------------------------------");
            System.out.println("\n");
            System.out.println("Produto comprado com sucesso!");
            System.out.println("Produto: " + produto.getNome() + " - Quantidade: " + quantidade);
            System.out.println("Valor total: R$" + valorTotal);
        } else {
            System.out.println("Descupe! Quantidade em estoque insuficiente.");
        }
    }

}
