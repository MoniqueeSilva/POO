package atividaeHelicoptero;

import java.util.Scanner;

public class PrincipalHelicoptero{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Frota frota = new Frota();
        frota.addHelicoptero(new Helicoptero(5));
        frota.addHelicoptero(new Helicoptero(5));
        int helicoperoSelecionado = 0;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Mostrar estado da frota");
            System.out.println("2 - Selecionar helicóptero");
            System.out.println("3 - Entrar pessoa");
            System.out.println("4 - Sair pessoa");
            System.out.println("5 - Ligar helicóptero");
            System.out.println("6 - Decolar");
            System.out.println("7 - Aterrissar");
            System.out.println("8 - Desligar helicóptero");
            System.out.println("9 - Adicionar novo helicóptero à frota");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nEstado da Frota:");
                    for (int i = 0; i < frota.getQuantidadeHelicopteros(); i++) {
                        frota.exibirHelicoptero(i);
                    }
                    break;
                    
                case 2:
                    System.out.print("Selecione o helicóptero (0 a " + (frota.getQuantidadeHelicopteros()-1) + "): ");
                    int escolha = teclado.nextInt();
                    if (escolha >= 0 && escolha < frota.getQuantidadeHelicopteros()) {
                        helicoperoSelecionado = escolha;
                        System.out.println("Helicóptero " + escolha + " selecionado.");
                    } else {
                        System.out.println("Opção inválida! Helicóptero não existe.");
                    }
                    break;
                    
                case 3:
                    if (frota.entrar(helicoperoSelecionado)) {
                        System.out.println("Uma pessoa entrou no helicóptero.");
                    } else {
                        System.out.println("Não foi possível entrar - verifique a capacidade ou se o helicóptero existe!");
                    }
                    break;
                    
                case 4:
                    if (frota.sair(helicoperoSelecionado)) {
                        System.out.println("Uma pessoa saiu do helicóptero.");
                    } else {
                        System.out.println("Não há pessoas no helicóptero para sair!");
                    }
                    break;
                    
                case 5:
                    if (frota.ligar(helicoperoSelecionado)) {
                        System.out.println("Helicóptero ligado.");
                    } else {
                        System.out.println("Não foi possível ligar - helicóptero já está ligado!");
                    }
                    break;
                    
                case 6:
                    System.out.print("Informe a altitude para decolar: ");
                    int alt = teclado.nextInt();
                    if (frota.decolar(helicoperoSelecionado, alt)) {
                        System.out.println("Helicóptero decolou para " + alt + " metros.");
                    } else {
                        System.out.println("Não foi possível decolar - verifique se está ligado e em terra!");
                    }
                    break;
                    
                case 7:
                    if (frota.aterrissar(helicoperoSelecionado)) {
                        System.out.println("Helicóptero aterrissou.");
                    } else {
                        System.out.println("Não foi possível aterrissar - verifique se está no ar!");
                    }
                    break;
                    
                case 8:
                    if (frota.desligar(helicoperoSelecionado)) {
                        System.out.println("Helicóptero desligado.");
                    } else {
                        System.out.println("Não foi possível desligar - verifique se está em terra!");
                    }
                    break;
                    
                case 9:
                    if (frota.getQuantidadeHelicopteros() < 10) {
                        System.out.print("Informe a capacidade do novo helicóptero: ");
                        int capacidade = teclado.nextInt();
                        if (capacidade > 0) {
                            frota.addHelicoptero(new Helicoptero(capacidade));
                            System.out.println("Helicóptero adicionado à frota! Total: " + frota.getQuantidadeHelicopteros());
                        } else {
                            System.out.println("Capacidade inválida! Deve ser maior que zero.");
                        }
                    } else {
                        System.out.println("A frota está completa (10 helicópteros)!");
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo do sistema...");
                    teclado.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}