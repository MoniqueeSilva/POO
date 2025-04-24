public class Principal {
    public static void main(String[] args) {
        Televisor tv = new Televisor(1, 11, false);
        System.out.println("ESTADO INICIAL DA TV: " + tv);

        tv.ligar();
        tv.aumentarVolume();
        tv.trocarCanal(5);
        System.out.println("TV ligada, aumentar volume e trocar canal: " + tv);

        ControleRemoto controle = new ControleRemoto(tv);

        controle.aumentarVolume();
        controle.trocarCanal(10);
        System.out.println("TV USANDO CONTROLE REMOTO: " + controle);

        controle.desligar();
        System.out.println("TV desligada: " + controle);
    }
}
