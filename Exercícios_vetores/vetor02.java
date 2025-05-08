package AulaPratica.vetores;

import java.util.Scanner;
//multiplica os elementos de vetorA com os elementos de vetorB
public class vetor02 {
    public static void main(String[] args){
        int vetorA[] = new int[8];
        int vetorB[] = new int[8];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite um valor: ");
            vetorA[i] = teclado.nextInt();
        }
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i] * 2;
            System.out.println("Valores do vetor B: " + vetorB[i]);
        }
        teclado.close();
    }
}
