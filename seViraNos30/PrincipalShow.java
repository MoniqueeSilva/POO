package seViraNos30;

public class PrincipalShow {
    public static void main(String[] args) {
        Dancarino dancarino = new Dancarino("Maria");
        Comediante comediante = new Comediante("Pedro");
        Magico magico = new Magico("Isabela");

        Palco palco = new Palco();

        palco.adicionarParticipante(dancarino);
        palco.adicionarParticipante(comediante);
        palco.adicionarParticipante(magico);

        palco.apresentarShow();
    }
}


