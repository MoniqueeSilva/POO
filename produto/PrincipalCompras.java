package produto;

import java.util.Scanner;

public class PrincipalCompras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mercado mercado = new Mercado();

        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1- Adicionar produto");
            System.out.println("2- Pesquisar produto");
            System.out.println("3- Excluir produto");
            System.out.println("4- Exibir produtos");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do Enter

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = teclado.nextLine();

                    System.out.print("Valor do produto: R$ ");
                    double valor = teclado.nextDouble();
                    teclado.nextLine(); // Limpa o buffer do Enter

                    Produto novoProduto = new Produto(nome, valor);
                    mercado.adicionarProduto(novoProduto);
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
                    System.out.print("Digite o nome do produto a excluir: ");
                    String nomeExclusao = teclado.nextLine();

                    boolean removido = mercado.excluirProduto(nomeExclusao);
                    if (removido) {
                        System.out.println("Produto excluído com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
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
