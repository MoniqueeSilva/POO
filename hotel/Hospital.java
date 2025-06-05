package hotel;

public class Hospital {
    private Quarto []vetor;
    private int indice;

    public Hospital(){
        vetor = new Quarto[10];
        indice = 0;
    }

    public void add(Quarto q){
        if(indice == vetor.length){
            System.out.println("Sem quartos disponiveis!");
        }
        else{
            vetor[indice++] = q;
        }
    }

    public void cancelar(int escolha){
        for(int i = 0; i < indice; i++){
            if(vetor[i] != null && vetor[i].getNumero() == escolha){
                vetor[i].cancelar();
            }
        }
    }

    public void reservar(int escolha){
        for(int i = 0; i < indice; i++){
            if(vetor[i] != null && vetor[i].getNumero() == escolha){
                vetor[i].reservar();
            }
        }
    }

    public void verificarQuarto(int escolha){
        for(int i = 0; i < indice; i++){
            if(vetor[i] != null && vetor[i].getNumero() == escolha){
                vetor[i].verificarQuarto();
            }
        }
    }

    public void imprimir(){
        for(int i = 0; i < indice; i++){
            if(vetor[i] != null && vetor[i].getDisponivel() == true){
                System.out.println("(" + i + ")" + vetor[i]);
            }
        }
    }
}
