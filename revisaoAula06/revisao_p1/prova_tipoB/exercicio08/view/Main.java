package revisao_p1.prova_tipoB.exercicio08.view;

import revisao_p1.prova_tipoB.exercicio08.model.Supermercado;

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Arroz", "Feijão", "Macarrão"};
        double[] precos = {20.0, 10.0, 8.0};
        double[] descontos = {10.0, 5.0, 15.0};

        Supermercado mercado = new Supermercado(nomes, precos, descontos);

        mercado.listarProdutos();
        System.out.printf("Total da compra: R$%.2f%n", mercado.calcularTotal());
        mercado.produtoMaiorEconomia();

        mercado.comprarProduto("Feijão");
        mercado.listarProdutos();

        mercado.reporProduto("Feijão", 12.0, 5.0);
        mercado.listarProdutos();
    }
}
