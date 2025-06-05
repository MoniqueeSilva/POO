package mercadinho;

public class ClienteOuroVip extends Cliente {
    private String endereco;
    private double resultado;

    public ClienteOuroVip(String nome, double valorDaCompra, String endereco) {
        super(nome, valorDaCompra);
        this.endereco = endereco;
    }

    public double calcularPagamento() {
        resultado = (getValorDaCompra() * 15) / 100;
        resultado = getValorDaCompra() - resultado;
        return resultado;
    }

    public String getEndereco() {
        return endereco;
    }
}
