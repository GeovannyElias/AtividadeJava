package exercicio01.model;

public class Calculadora implements OperacaoMat{
    private int a1;
    private int a2;

    public Calculadora(int a1, int a2){
        this.a1 = a1;
        this.a2 = a2;
    }

    public int getA1() {
        return a1;
    }
    public void setA1(int a1) {
        this.a1 = a1;
    }
    public int getA2(){
        return a2;
    }
    public void setA2(int a2){
        this.a2 = a2;
    }

    public int soma(){
        return a1 + a2;
    }
    public int subtracao(){
        return a1 - a2;
    }
    public int multiplicacao(){
        return a1 * a2;
    }
    public double divisao(){
       return a1 / a2;
    }
}