import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int opcao;

        do {
            System.out.println("\n===== MENU HOSPITAL =====");
            System.out.println("1. Criar quarto");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Reservar quarto");
            System.out.println("4. Verificar disponibilidade do quarto");
            System.out.println("5. Imprimir quartos disponíveis");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo do quarto: ");
                    String tipo = sc.nextLine();
                    System.out.print("Digite o número do quarto: ");
                    int numero = sc.nextInt();

                    hospital.add( new Quarto(tipo, numero));
                    break;

                case 2:
                    System.out.print("Digite o número do quarto para cancelar reserva: ");
                    int numCancelar = sc.nextInt();
                    hospital.cancelar(numCancelar);
                    break;

                case 3:
                    System.out.print("Digite o número do quarto para reservar: ");
                    int numReservar = sc.nextInt();
                    hospital.reservar(numReservar);
                    break;

                case 4:
                    System.out.print("Digite o número do quarto para verificar: ");
                    int numVerificar = sc.nextInt();
                    hospital.verificaQuarto(numVerificar);
                    break;

                case 5:
                    hospital.imprimir();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
