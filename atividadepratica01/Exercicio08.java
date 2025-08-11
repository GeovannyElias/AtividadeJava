package atividadepratica01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[]args) {
        /*Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos primeiros n números ímpares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.*/

        int num,resultado = 0,impar = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        num = scan.nextInt();

        for(int i = 1; i <= num; i++) {
            resultado += impar;
            impar += 2;
        }
        System.out.println("O resultado é: " +resultado);
    }
}
