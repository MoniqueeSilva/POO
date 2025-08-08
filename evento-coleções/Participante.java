import java.util.Objects;

public class Participante {
    String nome, email, telefone;

    public Participante(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Participante)){
            return false;
        }
        Participante outro = (Participante) o;
        return Objects.equals(email, outro.email);
    }
}
