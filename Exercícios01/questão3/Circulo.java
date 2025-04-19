public class Circulo{
    //atributos
    private double raio;
    private double pi = 3.141516;

    //construtor
    public Circulo(double raio){
    this.raio = raio;
    }

    //método
    public double calcularArea(){
    return pi * raio * raio;
    }

    //método
    public double calcularPerimetro(){
    return 2 * pi * raio;
    }

    //método
    public void imprimir(){
        System.out.printf("raio: %f \n", raio);
        System.out.printf("area: %f \n", calcularArea());
        System.out.printf("perimetro: %f \n", calcularPerimetro());
    }

}

