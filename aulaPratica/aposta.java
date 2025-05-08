package aulaPratica;
import java.util.Scanner;

public class aposta{
    public static void main(String[] args){
        int num[] = new int[5];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.println("Informe um número: ");
            num[i] = teclado.nextInt();
        }

        System.out.println("Números: ");
        for(int i = num.length - 1; i >= 0; --i){
            System.out.println(num[i] + " ");
        }
    }
}