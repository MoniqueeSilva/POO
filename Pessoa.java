// CLASSE
public class Pessoa{
   //ATRIBUTO: caracteristica
   private String nome; //private-> acessivel dentro dessa classe
   private int idade;

   //CONSTRUTOR(inicializa os atributos)
   public Pessoa(String nome, int idade){ //precisa passar os atributos(carregar) //não precisa definir tipo (void)
    this.nome = nome; //this-> para diferenciar a igualdade do nome da variavel e do atributo
    this.idade = idade;
   }

   //METODO: ações
   public void falar(){
    System.out.printf("Olá, mundo! Eu sou: %s e tenho: %d anos \n", nome, idade);
    System.out.println("Obrigado por ter falado comigo!");
   }

}