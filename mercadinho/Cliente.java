package mercadinho;

public abstract class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

     public String getNome() {
        return nome;
    }

    public abstract double calcularPagamento();

    public double getValorDaCompra() {
        return valorDaCompra;
    }
}



