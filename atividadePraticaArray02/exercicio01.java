import java.util.Scanner;
 
public class exercicio01 {
 
	public static void main(String[] args) {
		
		int [][] soma = new int[3][3];
		int [][] matriz1 = new int[3][3];
		int [][] matriz2 = new int[3][3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int linha = 0; linha < matriz1.length; linha++) {
			for(int coluna = 0; coluna < matriz1.length; coluna++) {
				
				System.out.println("Digite um numero para matriz1 na linha " + linha + " e na coluna " + coluna);
				matriz1[linha][coluna] = scan.nextInt();
				
				System.out.println("Digite um numero para matriz2 na linha " + linha + " e na coluna " + coluna);
				matriz2[linha][coluna] = scan.nextInt();
				
				soma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
			}
		}
		for(int linha = 0; linha < matriz1.length; linha++) {
			for(int coluna = 0; coluna < matriz1.length; coluna++) {
				
				System.out.print(soma[linha][coluna] + "  ");
				
			}
			System.out.println("");
		}
		}
	}
 
 
 