package mercadinho;

public class PrincipalMercadinho {
    public static void main(String[] args) {
        ClienteRegular clienteRegular = new ClienteRegular("Maria", 10);
        ClienteVip clienteVip = new ClienteVip("Monique", 100, "400.289-22");
        ClienteOuroVip clienteOuroVip = new ClienteOuroVip("Juca", 77, "Rua pedrinha");

        Mercadinho mercadinho = new Mercadinho();

        mercadinho.adicionarCliente(clienteRegular);
        mercadinho.adicionarCliente(clienteVip);
        mercadinho.adicionarCliente(clienteOuroVip);

        mercadinho.imprimirClientes();


    }
}
