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
    
    public int getvelocidade(){
        return velocidade;
    }

    public void acelerar(){
        velocidade += 10;
    }

    public void freiar(){
        velocidade -= -10; 
    }

    public void exibirDados(){
        System.out.printf("%s %s %d %d", fabricante, modelo, ano, velocidade);
    }

    public void Parar(){
        
    }
}
