public class FitaVideo{
    //atributos
    private String tituloFita;
    private double precoPorDia;

    //construtor
    public FitaVideo(String titulofita, double precoPorDia){
        this.tituloFita = titulofita;
        this.precoPorDia = precoPorDia;
    }

    //métodos
    public String getTituloFita(){
        return tituloFita;
    }

    //métodos
    public double getPrecoPorDia(){
        return precoPorDia;
    }

    //métodos
    public double getValorAluguel(int numeroDeDiasAlugada){
        return precoPorDia * numeroDeDiasAlugada;
    }

    //métodos
    public String toString(){
        return "Fita: " + tituloFita + ", Preço por dia: R$" + String.format("%.2f", precoPorDia);
    }
}