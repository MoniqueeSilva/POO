public class Quarto {
    private String tipo;
    private int numero;
    private boolean disponivel;

    public Quarto(String tipo, int numero){
        this.tipo = tipo;
        this.numero = numero;
        disponivel = true;
    }

    public void cancelar(){
        disponivel = true;
    }

    public void reservar(){
        disponivel = false;
    }

    public boolean verificaQuarto(){
        if(disponivel){
            System.out.println("Quarto esta disponivel!");
            return true;
        }
        else{
            System.out.println("Quarto nao esta disponivel!");
            return false;
        }
    }

    public String toString() {
        return String.format("Quarto %d | Tipo: %s | Disponível: %b", numero, tipo, disponivel);
    }

    public int getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
