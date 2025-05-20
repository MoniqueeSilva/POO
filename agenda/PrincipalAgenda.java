package agenda;
import java.util.Scanner;

public class PrincipalAgenda {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda(4);
        String nome, telefone;
        int idade;

        for(int i = 0; i < 4; i++){
            System.out.print("Informe o nome: ");
            nome = teclado.nextLine();
            System.out.print("Informe o telefone: ");
            telefone = teclado.nextLine();
            System.out.print("Informe a idade: ");
            idade = teclado.nextInt(); 
            teclado.nextLine();
            agenda.add(new Pessoa(nome, telefone, idade));
        }
        System.out.println("Nome da Pessoa mais nova: ");
        System.out.println(agenda.getNomeMaisNovo());
        teclado.close();
    }
}
