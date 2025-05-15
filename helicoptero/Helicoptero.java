package helicoptero;

public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidade;
    private int quantidadePessoas;

    public Helicoptero(int capacidade){
        this.ligado = false;
        this.altitude = 0;
        this.capacidade = capacidade;
        this.quantidadePessoas = 0;
    }

    public void entrar(){
        if(quantidadePessoas < capacidade){
            quantidadePessoas ++;
            System.out.println("ainda suporta mais passageiros");
        }else{
            System.out.println("helicóptero cheio");
        }
    }
    public void sair(){
        if(quantidadePessoas > 0){
            quantidadePessoas --;
            System.out.println("saindo...");
        }else{
            System.out.println("ainda tem pessoas");
        }
    }
    public void ligar(){
        if(ligado == false){
            ligado = true;
            System.out.println("helicóptero ligado");
        }else{
            System.out.println("já está ligado");
        }
    }
    public void decolar(int altitudeAtual){
        if(ligado == true && altitude == 0){
            altitude = altitudeAtual;
            System.out.println("Decolou");
        }else if(ligado == false){
            System.out.println("helicóptero desligado");
        }else{
            System.out.println("helicóptero já está no ar");
        }
    }
    public void aterrissar(){
        if(ligado == true && altitude > 0){
            altitude = 0;
            System.out.println("aterrissou");
        }else if(ligado == false){
            System.out.println("helicóptero desligado");
        }else{
            System.out.println("helicóptero já está no solo");
        }
    }
    public void desligar(){
        if(ligado == true && altitude == 0){
            ligado = false;
            System.out.println("helicóptero desligado");
        }else if(ligado == false){
            System.out.println("helicóptero já está desligado");
        }else{
            System.out.println("não foi possivel desligar");
        }
    }
    public boolean isLigado(){
        return ligado;
    }
    public int getAltitude(){
        return altitude;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int getQuantidadePessoas(){
        return quantidadePessoas;
    }
    public String toString() {
        return "Estado do Helicóptero: " +
                "\n- Ligado: " + (ligado ? "Sim" : "Não") +
                "\n- Altitude: " + altitude + " metros" +
                "\n- Capacidade: " + capacidade + " pessoas" +
                "\n- Pessoas presentes: " + quantidadePessoas + "/" + capacidade;
    }
   
}
