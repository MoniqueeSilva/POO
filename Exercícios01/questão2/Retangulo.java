public class Retangulo{
    //atributos
    private double comprimento;
    private double largura;

    //construtor
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    //método
    public double calcularArea(){
        return comprimento * largura;
    }

    //método
    public double calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }

    //método
    public void imprimir(){
        System.out.printf("comprimeto: %f \n", comprimento);
        System.out.printf("largura: %f \n", largura);
        System.out.printf("area: %f \n", calcularArea());
        System.out.printf("perimetro: %f \n", calcularPerimetro());
    }

}