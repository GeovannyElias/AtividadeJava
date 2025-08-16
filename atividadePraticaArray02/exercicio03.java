import java.util.Scanner;
 
public class exercicio03 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] palavras = new String[3][3];
		String[][] reverso = new String[3][3];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {		
				System.out.print("Digite uma palavra: ");
				palavras[linha][coluna] = scan.nextLine();
			}
		}
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				reverso[coluna][linha] = palavras[linha][coluna];
			}
		}
		for(String[] linha : reverso) {
			for(String coluna : linha) {
				System.out.println(coluna + " | ");
			}
			System.out.println();
		}
	}
}
 
 
 