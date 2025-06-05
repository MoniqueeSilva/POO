package mercadinho;

public class Mercadinho {
    private Cliente[] clientes;
    private int indice;

    public Mercadinho() {
        clientes = new Cliente[5];
        indice = 0;
    }

    public void adicionarCliente(Cliente c) {
        if(indice < clientes.length) {
            clientes[indice] = c;
            indice++;  
        } else {
            System.out.println("Limite máximo de clientes atingido!");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < indice; i++) {
            total += clientes[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes() {
        for (int i = 0; i < indice; i++) {
            if(clientes[i] != null) {  
                System.out.println(". Nome: " + clientes[i].getNome() + 
                                 ", Valor: " + clientes[i].getValorDaCompra() +
                                 ", Pagar: " + clientes[i].calcularPagamento());
            }
        }
    }
}