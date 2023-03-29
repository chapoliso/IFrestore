# IFrestore
Trabalho de POO1

# Problemática:
Temos uma loja de eletrônicos que precisa controlar seu estoque e vendas de produtos. Cada produto possui um código, nome, descrição, preço de compra, preço de venda e quantidade em estoque. A loja trabalha com diversos tipos de produtos como smartphones, notebooks e tablets, cada um com suas particularidades e funcionalidades específicas. Além disso, a loja possui um sistema de vendas que registra o cliente, o produto vendido, a quantidade e o valor total da venda. Para garantir a segurança das informações, é necessário utilizar o encapsulamento dos dados. Para facilitar a manutenção do sistema e a reutilização de código, é necessário utilizar a herança e o polimorfismo. Por fim, para evitar redundância de código utilizamos a sobrecarga de métodos.

Para o encapsulamento temos a classe Produto que terá os atributos com nível de acesso private: código, nome, descrição, preçoCompra, preçoVenda e quantidadeEmEstoque. Esses atributos serão acessados por meio dos métodos setters e getters.

Com o uso de polimorfismo será criada uma classe de teste que instancia objetos das subclasses Smartphone, Notebook e Tablet. Os objetos serão adicionados a um ArrayList da superclasse Produto. Será utilizada a sobrescrita de método para imprimir informações específicas de cada objeto. Também será utilizado o referenciamento de objetos de tipos diferentes a partir de uma mesma variável.


