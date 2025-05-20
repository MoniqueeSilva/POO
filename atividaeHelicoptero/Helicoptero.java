package atividaeHelicoptero;

public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int pessoas;
    
    public Helicoptero(int capacidade) {
        this.ligado = false;
        this.altitude = 0;
        this.capacidade = capacidade;
        this.pessoas = 0;
    }
    
    public boolean getLigado() {
        return ligado;
    }
    
    public int getAltitude() {
        return altitude;
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }
    
    public boolean entrar() {
        if (pessoas < capacidade) {
            pessoas++;
            return true;
        }
        return false;
    }
    
    public boolean sair() {
        if (pessoas > 0) {
            pessoas--;
            return true;
        }
        return false;
    }
    
    public boolean ligar() {
        if (!ligado) {
            ligado = true;
            return true;
        }
        return false;
    }
    
    public boolean decolar(int novaAltitude) {
        if (ligado && altitude == 0 && novaAltitude > 0) {
            altitude = novaAltitude;
            return true;
        }
        return false;
    }
    
    public boolean aterrissar() {
        if (ligado && altitude > 0) {
            altitude = 0;
            return true;
        }
        return false;
    }
    
    public boolean desligar() {
        if (ligado && altitude == 0) {
            ligado = false;
            return true;
        }
        return false;
    }

    public String toString() {
        String estado = ligado ? "Ligado" : "Desligado";
        String situacao = altitude > 0 ? "Em voo (" + altitude + "m)" : "Em terra";
        return String.format("Helicóptero [%s, %s, Capacidade: %d/%d pessoas]",estado, situacao, pessoas, capacidade);
    }
}