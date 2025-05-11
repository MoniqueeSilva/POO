public class Principal {
    public static void main(String[] args){
        Pessoa p = new Pessoa("João", 18); //criando objeto na memoria
        p.falar();

        Carro c = new Carro("Ford", "Ka", 2024);
        c.acelerar();
        int vezes = 0;
        while(vezes < 5){
            c.acelerar();
            c.exibirDados();
            vezes++;

        }

        if(c.getVelocidade() > 100){
            System.out.println("Parando imediatamente.");
            c.parar();
            c.exibirDados();
        } else {
            System.out.println("Freando aos poucos:");
            while(c.getVelocidade() > 0){
                c.frear();
                c.exibirDados();
            }
        }
    }
}