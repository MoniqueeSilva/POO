import java.util.*;

public class SistemaEventos {
    private Map<String, Evento> eventos;

    public SistemaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionaEvento(Evento evento) {
        eventos.put(evento.getNome(), evento);
    }

    public Evento buscarEvento(String nome) {
        return eventos.get(nome);
    }

    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos.values());
    }
}
