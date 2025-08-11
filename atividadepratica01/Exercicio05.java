package atividadepratica01;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        /*
         * Crie um programa que solicite ao usuário a entrada de um número inteiro.
         * Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
         */
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        num = scan.nextInt();

        if (num == 0) {
            System.out.println("O valor e: " +num);
        } else if (num % 2 == 0) {
            System.out.println("O valor par: " + num);
        } else {
            System.out.println("O valor impar: " + num);
        }
    }
}
