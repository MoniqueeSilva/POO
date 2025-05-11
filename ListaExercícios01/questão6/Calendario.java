public class Calendario {
    //atributos
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //métodos nome do mês
    public String nomeMes(int m) {
        String nome;
        switch (m) {
            case 1: nome = "janeiro"; break;
            case 2: nome = "fevereiro"; break;
            case 3: nome = "março"; break;
            case 4: nome = "abril"; break;
            case 5: nome = "maio"; break;
            case 6: nome = "junho"; break;
            case 7: nome = "julho"; break;
            case 8: nome = "agosto"; break;
            case 9: nome = "setembro"; break;
            case 10: nome = "outubro"; break;
            case 11: nome = "novembro"; break;
            case 12: nome = "dezembro"; break;
            default: nome = "mês inválido";
        }
        return nome;
    }

    //método exibir data 
    public void mostrarData() {
        System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
    }

    //método verificar se o ano é bissexto
    public void anoBissexto() {
        if (ano % 4 == 0) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}
