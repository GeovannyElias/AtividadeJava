package atividadepratica01;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        /*
         * Crie um programa que solicite ao usuário um número e calcule o fatorial desse
         * número.
         */

        int num,resultado = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        num = scan.nextInt();

        for(int i = 1; i <= num; i++) {
            resultado *= i;  
        }
        System.out.println("O fatorial de " + num + " e: " + resultado);
    }
}
