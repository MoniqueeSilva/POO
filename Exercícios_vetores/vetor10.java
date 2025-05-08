package AulaPratica.vetores;

import java.util.Scanner;

public class vetor10 {
    public static void main(String[] args){
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite vetor A: ");
            vetorA[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] % 2;
            System.out.println("Valores do vetor: " + vetorB[i]);
        }

        teclado.close();
    }
}
