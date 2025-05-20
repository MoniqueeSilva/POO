package agenda;

public class Agenda{
    private Pessoa[] pessoas;
    private int qtd;

    public Agenda(int capacidade) {
        this.qtd = 0;
        this.pessoas = new Pessoa[capacidade];
    }

    public boolean add(Pessoa p) {
        if (qtd == this.pessoas.length) return false;
        this.pessoas[this.qtd++] = p;
        return true;
    }

    public String getNomeMaisNovo() {
        if (this.qtd == 0) return null;
        Pessoa menor = this.pessoas[0];
        for (int i = 1; i < this.qtd; i++) {
            if (this.pessoas[i].getIdade() < menor.getIdade()) {
                menor = this.pessoas[i];
            }
        }
        return menor.getNome();
    }
}
