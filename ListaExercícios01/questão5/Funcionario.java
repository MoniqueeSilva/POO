public class Funcionario{
    //atributos
    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private int idade;
    private double salario;

    //construtor
    public Funcionario(int codigo, String nome, String CPF, String endereco, String telefone, int idade, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    //métodos get e set
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //método
    public String getEstado(){
        return "Código: " + codigo + "\n"
            + "Nome: " + nome + "\n"
            + "CPF: " + CPF + "\n"
            + "Endereço: " + endereco + "\n"
            + "Telefone: " + telefone + "\n"
            + "Idade: " + idade + "\n"
            + "Salário Bruto: R$" + salario;
    }

    //método
    public double calculaSalarioLiquido() {
        return salario - (salario * 0.11f);
    }
}