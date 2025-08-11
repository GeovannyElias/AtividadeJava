package atividadepratica01;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
         * Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). Use um loop
         * while para pedir ao usuário que insira a senha. Se a senha estiver incorreta,
         * continue pedindo a senha e informe ao usuário que a tentativa foi inválida.
         * Se ele acertar, saia do loop e imprima uma mensagem de sucesso.
         */
        String senhaSecreta = "Java123";
        String senha;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite a senha: ");
            senha = scan.nextLine();

            if (!senha.equals(senhaSecreta)) {
                System.out.println("Senha incorreta");
            }
        } while (!senha.equals(senhaSecreta));
        System.out.println("Senha correta");
    }
}