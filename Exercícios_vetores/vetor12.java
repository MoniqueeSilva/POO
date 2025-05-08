package AulaPratica.vetores;

import java.util.Scanner;

public class vetor12 {
    public static void main(String[] args){
        int vetorA[] = new int[10];
        int soma = 0;
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor: ");
            vetorA[i] = teclado.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
        }

        System.out.println("Quantidade de elementos pares no vetor: " + soma);

        teclado.close();
    }
}
