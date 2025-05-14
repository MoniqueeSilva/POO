package produto;

public class PrincipalCompras {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        mercado.adicionarProduto(new Produto("Arroz", 5.99));
        mercado.adicionarProduto(new Produto("Feijão", 8.49));
        mercado.adicionarProduto(new Produto("Leite", 4.29));
        mercado.adicionarProduto(new Produto("Café", 17.50));

        mercado.listarProdutos();

        Produto encontrado = mercado.pesquisarProduto("Feijão");
        if (encontrado != null) {
            System.out.println("\nProduto encontrado: " + encontrado);
        } else {
            System.out.println("\nProduto não encontrado");
        }

        boolean removido = mercado.excluirProduto("Leite");
        if (removido) {
            System.out.println("\nProduto removido com sucesso!\n");
        } else {
            System.out.println("\nProduto não encontrado para remoção\n");
        }

        mercado.listarProdutos();
    }
}
