package exercicio02.model;

public class PagamentoDinheiro implements IPagamento{
    private double valor;
    private double desconto;

    public PagamentoDinheiro(double valor, double desconto){
        this.valor = valor;
        this.desconto = desconto;
    }
    public double getdesconto() {
        return desconto;
    }
    public void setdesconto(double desconto) {
        this.desconto = desconto;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularPagamento(){
        return this.valor - (this.valor * this.desconto);
    }
    public String emitirRecibido(){
        return "O valor original é: " + this.valor + "\nValor com desconto: " + calcularPagamento();
    }
}
