public class Principal {
    //criando objetos
    public static void main(String[] args){
        FitaVideo fita1 = new FitaVideo("Game of thrones", 7.99);
        FitaVideo fita2 = new FitaVideo("House of the dragon", 9.99);
        FitaVideo fita3 = new FitaVideo("You", 3.99);
        FitaVideo fita4 = new FitaVideo("Vikings", 9.99);

        //exibindo informações
        System.out.println(fita1.toString());
        System.out.println("Valor para 3 dias: R$" + String.format("%.2f", fita1.getValorAluguel(3)));
        
        System.out.println(fita2.toString());
        System.out.println("Valor para 2 dias: R$" + String.format("%.2f", fita2.getValorAluguel(2)));
        
        System.out.println(fita3.toString());
        System.out.println("Valor para 5 dias: R$" + String.format("%.2f", fita3.getValorAluguel(5)));

        System.out.println(fita4.toString());
        System.out.println("Valor para 7  dias: R$" + String.format("%.2f", fita3.getValorAluguel(7)));
    }
}
