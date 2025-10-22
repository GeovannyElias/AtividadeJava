package exercicio02.view;
import exercicio02.model.PagamentoCartao;
import exercicio02.model.PagamentoDinheiro;

public class Main {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao(100, 0.05);
        System.out.println(cartao.calcularPagamento());
        System.out.println(cartao.emitirRecibido());
        
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(100, 0.1);
        System.out.println(dinheiro.calcularPagamento());
        System.out.println(dinheiro.emitirRecibido());
    }
}
