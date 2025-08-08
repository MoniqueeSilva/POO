import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaEventos sistema = new SistemaEventos();
        Evento saoJoao = new Evento("São João", LocalDate.of(16, 7, 2025), 3);
        Evento folclore = new Evento("Folclore", LocalDate.of(22, 8, 2025), 2);
        sistema.adicionaEvento(saoJoao);
        sistema.adicionaEvento(folclore);

        saoJoao.adicionarParticipante(new Participante("Ana", "ana@email.com", "123456"));
        saoJoao.adicionarParticipante(new Participante("Bruno", "bruno@email.com", "654321"));
        saoJoao.adicionarParticipante(new Participante("Carlos", "carlos@email.com", "7890101"));

        folclore.adicionarParticipante(new Participante("Daniela", "daniela@email.com", "278914"));
        folclore.adicionarParticipante(new Participante("Eduardo", "eduardo@email.com", "897532"));

        System.out.println("Lista de Eventos:");
        for (Evento evento : sistema.listarEventos()) {
            System.out.println(evento);
        }

        System.out.print("\n Ver participantes digitando o nome do evento: ");
        String nomeEvento = scanner.nextLine();
        Evento eventoSelecionado = sistema.buscarEvento(nomeEvento);

        if (eventoSelecionado != null) {
            List<Participante> pOrdenados = eventoSelecionado.listarNome();
            System.out.println("Participantes do evento: " + nomeEvento);
            for (Participante p : pOrdenados) {
                System.out.println(p);
            }

            System.out.print("\nDigite a inicial para buscar participantes: ");
            char letra = scanner.nextLine().charAt(0);
            var encontrados = eventoSelecionado.buscarInicial(letra);
            System.out.println("Participantes com inicial '" + letra + "':");
            encontrados.forEach(System.out::println);
        } else {
            System.out.println("Evento não encontrado.");
        }

        scanner.close();
    }
}
