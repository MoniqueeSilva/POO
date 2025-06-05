package mercadinho;

public class ClienteVip extends Cliente {
    private String numeroCartao;
    private double resultado;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }

    public double calcularPagamento() {
        resultado = (getValorDaCompra() * 10) / 100;
        resultado = getValorDaCompra() - resultado;
        return resultado;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
}