public class Televisor{
    private int canal;
    private int volume;
    boolean ligado;

    public Televisor(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public void aumentarVolume(){
        this.volume ++;
    }
    public void diminuirVolume(){
        this.volume --;
    }
    public void trocarCanal(int novoCanal){
        this.canal = novoCanal;
    }
    public String toString() {
        return "Canal: " + canal + ", Volume: " + volume + ", Ligado? " + (ligado ? "Sim" : "Não");
    }
}