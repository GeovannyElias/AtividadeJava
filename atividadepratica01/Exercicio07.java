package atividadepratica01;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[]args) {
        /*Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).*/

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a idade");
        num = scan.nextInt();

        if(num < 18) {
            System.out.println("Menor de idade");
        }
        else if(num < 59 && num  >= 18) {
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }

    }
}
