package helicoptero;

public class PrincipalHelicoptero {
    public static void main(String[] args){
        Helicoptero helicoptero01 = new Helicoptero(5);
        Helicoptero helicoptero02 = new Helicoptero(5);

        System.out.println("\n ~~~Estado Inicial ~~~");
        System.out.println("Helicóptero 1:\n" + helicoptero01);
        System.out.println("\nHelicóptero 2:\n" + helicoptero02);

        System.out.println("\n~~~ Entrada de Pessoas ~~~");
        for (int i = 0; i < 3; i++) {
            helicoptero01.entrar();
        }
        for (int i = 0; i < 2; i++) {
            helicoptero02.entrar();
        }

        System.out.println("\n~~~ Ligando Helicópteros ~~~");
        helicoptero01.ligar();
        helicoptero02.ligar();

        System.out.println("\n~~~ Decolando ~~~");
        helicoptero01.decolar(300);
        helicoptero02.decolar(450);

        System.out.println("\n~~~ Estado Após Decolagem ~~~");
        System.out.println("Helicóptero 1:\n" + helicoptero01);
        System.out.println("\nHelicóptero 2:\n" + helicoptero02);

        System.out.println("\n~~~ Aterrissando ~~~");
        helicoptero01.aterrissar();
        helicoptero02.aterrissar();

        System.out.println("\n~~~ Desligando Helicópteros ~~~");
        helicoptero01.desligar();
        helicoptero02.desligar();

        System.out.println("\n~~~ Saída de Pessoas ~~~");
        helicoptero01.sair();
        helicoptero02.sair();

        System.out.println("\n~~~ Estado Final ~~~");
        System.out.println("Helicóptero 1:\n" + helicoptero01);
        System.out.println("\nHelicóptero 2:\n" + helicoptero02);
    }
}

