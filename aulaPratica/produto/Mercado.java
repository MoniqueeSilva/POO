package aulaPratica.produto;

public class Mercado {
    private Produto[] produtos;
    private int quantidade;

    public Mercado(){
        this.produtos = new Produto[20];
        this.quantidade = 0;
    }
    public boolean adicionarProduto(Produto produto){
        if(quantidade < 20){
            produtos[quantidade] = produto;
            quantidade++;
            return true;
        }
        return false;
    }
    public Produto pesquisarProduto(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) { // para não ter erro de digitação
                return produtos[i];
            }
        }
        return null;
    }
    public boolean excluirProduto(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nome)) { //para não ter erro de digitação
                for (int j = i; j < quantidade - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[quantidade - 1] = null;
                quantidade--;
                return true;
            }
        }
        return false;
    }
    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(produtos[i]);
        }
    }
}
