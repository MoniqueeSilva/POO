package AulaPratica.vetores;

import java.util.Scanner;
import java.lang.Math;
public class vetor04 {
     public static void main(String[] args){
        double vetorA[] = new double[15];
        double vetorB[] = new double[15];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor: ");
            vetorA[i] = teclado.nextDouble();
        }
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.printf("Valores do vetor: %.2f \n", vetorB[i]);
        }
        teclado.close();
    }
}
