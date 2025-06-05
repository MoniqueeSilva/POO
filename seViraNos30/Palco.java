package seViraNos30;

public class Palco {
    private Participante[] participantes;
    private int indece;

    public Palco(){
        participantes = new Participante[10];
    }

    public void adicionarParticipante(Participante p){
        if(indece < participantes.length){
            participantes[indece] = p;
        }
    }

    public void apresentarShow(){
        for(int i = 0; i < indece; i++){
            participantes[i].seViraNosTrinta();
        }
    }
}
