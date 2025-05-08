package exerciciosVetores;

import java.util.Scanner;

public class vetor08 {
    public static void main(String[] args){
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite vetor A: ");
            vetorA[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            System.out.print("Digite vetor B: ");
            vetorB[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
            System.out.println("Valores do vetor C: " + vetorC[i]);
        }
        teclado.close();
    }
}
