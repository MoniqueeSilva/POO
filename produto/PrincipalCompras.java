package produto;

import java.util.Scanner;

public class PrincipalCompras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mercado mercado = new Mercado();

        while(true){
            System.out.println("\n === MENU ===");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Pesquisar produto");
            System.out.println("3- Excluir produto");
            System.out.println("4- Exibir produtos");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Nome do produto: ");
                    String nome = teclado.nextLine();
                    System.out.println("Valor do produto: R$");
                    double valor = teclado.nextDouble();

                    Produto novProduto = new Produto(nome, valor);
                    mercado.adicionarProduto(novProduto);
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto a pesquisar: ");
                    String nomePesquisa = teclado.nextLine();
                    Produto produtoEncontrado = mercado.pesquisarProduto(nomePesquisa);
                    if (produtoEncontrado != null) {
                        System.out.println("\nProduto encontrado:");
                        System.out.println(produtoEncontrado);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                    
                case 3:
                    mercado.listarProdutos();
                    break;
                    
                case 0:
                    System.out.println("Saindo do sistema...");
                    teclado.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
            
    }
}
