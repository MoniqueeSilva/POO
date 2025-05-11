public class Quadrado{
    //atributo
    private double lado;

    //construtor
    public Quadrado(double lado){
        this.lado = lado;
    }

    //método
    public double calcularArea(){
        return lado * lado;
    }

    //método
    public double calcularPerimetro(){
        return 4 * lado;
    }

    //método
    public void imprimir(){
        System.out.printf("Valores do lado: %f \n", lado);
        System.out.printf("valor da area: %f \n", calcularArea());
        System.out.printf("valor do perimetro: %f \n",calcularPerimetro()); 
    }

}