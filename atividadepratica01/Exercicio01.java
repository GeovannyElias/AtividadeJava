package atividadepratica01;
import java.util.Scanner;

public class Exercicio01 {
    	
 public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor");
		num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("O valor e positivo");
		}else if(num < 0) {
			System.out.println("O valor e negativo");
			
		}else {
			System.out.println("valor negativo");
		}
}
 
}