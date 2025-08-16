import java.util.Scanner;
 
public class exercicio02 {
 
	public static void main(String[] args) {
		boolean acesso = false;
		Scanner scan = new Scanner(System.in);
		String[][] matriz1 = {
				{ "ata@email.com" , "122"},
				{ "bebo@email.com" , "123"},
				{ "teste@email.com" , "128"},
				{ "jogo@email.com" , "120"},
				{ "tenis@email.com" , "129"},
				{ "teste2@email.com" , "124"}
		};
		
		System.out.println("Qual e o Email: ");
		String Email = scan.nextLine();
		
		System.out.println("Qual e o Senha: ");
		String Senha = scan.nextLine();
		
		for(int linha = 0; linha < matriz1.length; linha++) {
			if(Email.equals(matriz1[linha][0]) && Senha.equals(matriz1[linha][1])) {
					acesso = true;
					break;
			}
		}
		if(acesso == true) {
			System.out.println("Login Aceito");
		}
		else {
			System.out.println("Login Negado");
		}
		
	}
}