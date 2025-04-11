public class Principal {
    //METODO MAIN 
    public static void main(String[] args){
        Pessoa p = new Pessoa("João", 18); //criando objeto na memoria
        p.falar();

        Carro c = new Carro("Ford", "Kar", 2024);
        c.acelerar();
        int vezes = 0;
        while(vezes < 5){
            c.acelerar();
            c.exibirDados();
            vezes++;

        }

        while(c.getvelocidade() > 0) {
        c.freiar();
        c.exibirDados();
        }
        
    }
}
