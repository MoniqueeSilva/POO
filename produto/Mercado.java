package produto;

public class Mercado {
    private Produto[] produtos;
    private int quantidade;

    public Mercado(){
        this.produtos = new Produto[20];
        this.quantidade = 0;
    }
    public void adicionarProduto(Produto NovoProduto){
        if(quantidade < 20){
            produtos[quantidade] = NovoProduto;
            quantidade++;
        }else{
            System.out.println("Quantidade de produtos preenchida");
        }
    }
    public Produto pesquisarProduto(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].getNome().equals(nome)) {
                return produtos[i];
            }
        }
        return null;
    }
    public boolean excluirProduto(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].getNome().equals(nome)) {
                for (int j = i; j < quantidade - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                quantidade--;
                return true;
            }
        }
        return false;
    }

    public int getQuantidadeProduto(){
        return quantidade;
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(produtos[i]);
        }
    }
}
