public class Carro {
    //ATRIBUTO
    private String fabricante;
    private String modelo;
    private int ano;
    private int velocidade;

    //CONSTRUTOR
    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        velocidade = 0; //não precisa, pois ja inicializa com 0
    }
    
    //METÓDOS
    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar(){
        velocidade += 10;
    }

    public void frear(){
        if(velocidade <= 60){
            velocidade -= 10;
        }
        else{
            velocidade = 0;
        }
    }

    public void parar(){
        velocidade = 0;
    }

    public void exibirDados(){
        System.out.printf("%s %s %d - Velocidade atual: %d \n", fabricante, modelo, ano, velocidade);
    }
}
