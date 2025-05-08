package AulaPratica.vetores;

import java.util.Scanner;

public class vetor05 {
     public static void main(String[] args){
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor: ");
            vetorA[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * i;
            System.out.println("Valores do vetor: " + vetorB[i]);
        }
        teclado.close();
    }
}
