package atividadepratica01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
    /*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior. */
    

    int num1,num2;
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um valor:");
    num1 = scan.nextInt();

    System.out.println("Digite outro valor:");
    num2 = scan.nextInt();

    if(num1 == num2){
        System.out.println("Os valores são iguais");
    }
    else if(num1 > num2) {
        System.out.println("Os numeros estão diferentes o primeiro e maior que o segundo");
    }
    else{
        System.out.println("Os numeros estão differentes o Segundo e maior que o primeiro");
    }

    }
}
