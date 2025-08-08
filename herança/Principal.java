public class Principal {
    public static void main(String[] args) {
        Aluno a = new Aluno("João", "40028922", "Rua: tralala", 100);
        System.out.println(a.getNome());
        System.out.println(a.getCPF());
        System.out.println(a.getEndereco());
        System.out.println(a.getNota());

        Professor f = new Funcionario("Maria", "123456", "rua", 3.2810);
        System.out.println(f.getNome());
        System.out.println(f.getCPF());
        System.out.println(f.getEndereco());
        System.out.println(f.getSalario());
    }
}
