package aposta;

import java.util.Scanner;

public class PrincipalSorteGrande {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas apostas você quer fazer?");
        int quantidadeApostas = teclado.nextInt();
        SorteGrande sorteGrande = new SorteGrande(quantidadeApostas);

        for(int i = 0; i < quantidadeApostas; i++){
            System.out.printf("Digite a quantidade de números da %dª aposta \n", i + 1);
            int qtdeNumeros = teclado.nextInt();
            int[] aposta = new int[qtdeNumeros];
            for(int j = 0; j < aposta.length; j++){
                System.out.printf("Digite o %dº número da %dª aposta \n", j + 1, i + 1);
                aposta[j] = teclado.nextInt();
            }

            sorteGrande.adicionaAposta(aposta);
        }

        sorteGrande.imprimirApostas();

        teclado.close();
    }
}
