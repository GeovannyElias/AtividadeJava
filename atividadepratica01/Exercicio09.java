package atividadepratica01;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
         * Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após
         * inserir todos os nomes, peça outro nome e use um loop for para percorrer a
         * lista e verificar se o 6º(último) nome digitado está presente no array dos 5
         * nomes informados inicialmente.
         */

        Boolean nomeAchado = false;
        String ultimoNome;
        String[] nome = new String[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° nome: ");
            nome[i] = scan.nextLine();
        }
        System.out.println("Digite o 6° nome: ");
        ultimoNome = scan.nextLine();

        for (int i = 0; i < nome.length; i++) {
            if (ultimoNome.equals(nome[i])) {
                nomeAchado = true;
            }
        }
        if (nomeAchado == true) {
            System.out.println("Achei o seu nome " + ultimoNome + " na lista");
        } else {
            System.out.println("Não achei o nome " + ultimoNome + " na lista");

        }
    }
}
