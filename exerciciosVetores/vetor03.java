package exerciciosVetores;

import java.util.Scanner;

public class vetor03 {
    public static void main(String[] args){
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor: ");
            vetorA[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Valores do vetor B: " + vetorB[i]);
        }
        teclado.close();
    }
}
