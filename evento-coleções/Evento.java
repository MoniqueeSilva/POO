import java.time.LocalDate;
import java.util.*;

public class Evento {
    private String nome;
    private LocalDate data;
    private Set<Participante> participantes;
    private int capacidadeMaxima;

    public Evento(String nome, LocalDate data, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.capacidadeMaxima = capacidadeMaxima;
        this.participantes = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean adicionar(Participante p) {
        if (participantes.size() < capacidadeMaxima) {
            return participantes.add(p);
        }
        return false;
    }

    public List<Participante> listarNome() {
        List<Participante> lista = new ArrayList<>(participantes);
        lista.sort(Comparator.comparing(Participante::getNome));
        return lista;
    }
}
