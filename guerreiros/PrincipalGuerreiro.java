package guerreiros;
import java.util.Scanner;

public class PrincipalGuerreiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guerreiro guerreiro1 = null;
        Guerreiro guerreiro2 = null;
        
        while (true) {
            System.out.println("\n=== GUERREIROS DA POO ===");
            System.out.println("1. Cadastrar dois guerreiros");
            System.out.println("2. Iniciar uma luta (com laço)");
            System.out.println("3. Iniciar uma luta (com recursividade)");
            System.out.println("4. Alimentar um guerreiro");
            System.out.println("5. Exibir informações dos guerreiros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    System.out.println("\nCadastro do Guerreiro 1:");
                    System.out.print("Código: ");
                    int codigo1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome1 = scanner.nextLine();
                    guerreiro1 = new Guerreiro(codigo1, nome1);
                    
                    System.out.println("\nCadastro do Guerreiro 2:");
                    System.out.print("Código: ");
                    int codigo2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome2 = scanner.nextLine();
                    guerreiro2 = new Guerreiro(codigo2, nome2);
                    
                    System.out.println("\nGuerreiros cadastrados com sucesso!");
                    break;
                    
                case 2:
                    if (verificarGuerreiros(guerreiro1, guerreiro2)) {
                        guerreiro1.lutar(guerreiro2);
                    }
                    break;
                    
                case 3:
                    if (verificarGuerreiros(guerreiro1, guerreiro2)) {
                        guerreiro1.lutarRecursivo(guerreiro2);
                    }
                    break;
                    
                case 4:
                    if (verificarGuerreiros(guerreiro1, guerreiro2)) {
                        System.out.println("\nQual guerreiro deseja alimentar?");
                        System.out.println("1. " + guerreiro1.toString());
                        System.out.println("2. " + guerreiro2.toString());
                        System.out.print("Escolha: ");
                        int escolha = scanner.nextInt();
                        
                        if (escolha == 1) {
                            guerreiro1.alimentarSe();
                        } else if (escolha == 2) {
                            guerreiro2.alimentarSe();
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;
                    
                case 5:
                    if (verificarGuerreiros(guerreiro1, guerreiro2)) {
                        System.out.println("\nInformações dos Guerreiros:");
                        System.out.println(guerreiro1);
                        System.out.println(guerreiro2);
                    }
                    break;
                    
                case 0:
                    System.out.println("Encerrando o jogo...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static boolean verificarGuerreiros(Guerreiro g1, Guerreiro g2) {
        if (g1 == null || g2 == null) {
            System.out.println("\nErro: Cadastre dois guerreiros primeiro!");
            return false;
        }
        return true;
    }
}