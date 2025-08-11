package atividadepratica01;
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[]args){
        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */

        int num,resultado;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor para a tabuada");
        num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            resultado = num * i;

            System.out.println(num+" X " + i + " = " +resultado);
        }
    }
}
