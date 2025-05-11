public class Principal06 {
    //criando objeto
    public static void main(String[] args) {
        // Criando dois objetos Calendário
        Calendario data1 = new Calendario(11, 4, 2005);
        Calendario data2 = new Calendario(20, 04, 2024);

        //exibir dados
        System.out.println("Calendário 1:");
        data1.mostrarData();
        data1.anoBissexto();

        System.out.println("Calendário 2:");
        data2.mostrarData();
        data2.anoBissexto();
    }
}

