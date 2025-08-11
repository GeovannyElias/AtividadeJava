package atividadepratica01;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args){

        /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. areacirculo=(raio*raio) * 3.14159 */
        double quadrado,circulo,area;
        int menu;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha as opções 1 - área do quadrado ou 2 - área do circulo");
        menu = scan.nextInt();

        switch(menu) {
            case 1:
            System.out.println("Qual valor do lado do quadrado: ");
            quadrado = scan.nextDouble();
              area = quadrado * quadrado;
              System.out.println("a área do quadrado é: " +area);
              break;
            case 2:
            System.out.println("Qual valor da área do circulo: ");
            circulo = scan.nextDouble();
              area = (circulo * circulo) * 3.14159;
              System.out.println("a área do circulo é: " +area);
              break;

              default:
              System.out.println(" Escolha somente entre 1 ou 2");
              break;

        }
        

    }
}
