package atividaeHelicoptero;

public class Frota {
    private Helicoptero[] helicopteros;
    private int indice;

    public Frota() {
        this.helicopteros = new Helicoptero[10];
        this.indice = 0;
    }

    public void addHelicoptero(Helicoptero novoHelicoptero) {
        if (indice < 10) {
            helicopteros[indice] = novoHelicoptero; // Adiciona o novo helicóptero na próxima posição livre
            indice++; // Incrementa o índice para a próxima posição
        } else {
            System.out.println("A frota está completa!");
        }
    }

    public boolean ligar(int n) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
            return false;
        }
        return helicopteros[n].ligar();
    }

    public boolean desligar(int n) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
            return false;
        }
        return helicopteros[n].desligar();
    }

    public boolean entrar(int n) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
            return false;
        }
        return helicopteros[n].entrar();
    }

    public boolean sair(int n) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
            return false;
        }
        return helicopteros[n].sair();
    }

    public boolean decolar(int n, int novaAltitude) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
            return false;
        }
        return helicopteros[n].decolar(novaAltitude);
    }

    public boolean aterrissar(int n) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
            return false;
        }
        return helicopteros[n].aterrissar();
    }
    
    public int getQuantidadeHelicopteros() {
        return indice;
    }

    public void exibirHelicoptero(int n) {
        if (n < 0 || n >= indice) {
            System.out.println("Helicoptéro não existe na frota!");
        } else {
            System.out.println(helicopteros[n].toString());
        }
    }
}