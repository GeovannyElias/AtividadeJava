package exercicio01.view;
import exercicio01.model.Calculadora;

public class Main{
    public static void main(String[] args) {
        Calculadora Batata  = new Calculadora(10, 5);

        System.out.println(Batata.soma());
        System.out.println(Batata.subtracao());
        System.out.println(Batata.multiplicacao());
        System.out.println(Batata.divisao());
    }
}

