//scanner para ler dados do teclado
import java.util.Scanner;

public class Principal{
    //criando objeto
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        //dados iniciais
        Funcionario funcionario = new Funcionario(
            123456,
            "Monique da Silva",
            "123.456.789-100",
            "Rua Rá-Tim-Bu, 01",
            "(83) 4002-8922",
            20,
            2000
        );

        //exibir e receber dados
         System.out.println(" DADOS DO FUNCIONÁRIO ");
         System.out.println(funcionario.getEstado());
 
         System.out.print("\nDigite o novo salário para o funcionário: R$ ");
         float novoSalario = teclado.nextFloat(); //lê o valor digitado
         funcionario.setSalario(novoSalario);
 
         System.out.println(" DADOS ATUALIZADOS DO FUNCIONÁRIO ");
         System.out.println(funcionario.getEstado());
         System.out.println("Salário Líquido: R$ " + funcionario.calculaSalarioLiquido());
        
         //fecha o scanner
         teclado.close();
    }
}
