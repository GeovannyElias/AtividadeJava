package revisao_p1.prova_tipoC.exercicio08.view;

import revisao_p1.prova_tipoC.exercicio08.model.PostoCombustivel;

public class Main {
     public static void main(String[] args) {

        String[] tipos = { "Gasolina", "Etanol", "Diesel" };
        double[] precos = { 6.25, 3.37, 4.95 };
        int[] litros = { 5000, 3000, 4000 };

        PostoCombustivel posto = new PostoCombustivel(tipos, precos, litros);

        
        posto.exibirCombustiveis();

        
        double valorTotal = posto.calcularValorTotalEstoque();
        System.out.println("Valor total em estoque: R$ " + valorTotal);

       
        posto.analisarEstoque();

        posto.venderCombustivel(0, 50); 

        posto.reabastecerBomba(1, 2000); 

        posto.exibirCombustiveis();

        posto.analisarEstoque();

        valorTotal = posto.calcularValorTotalEstoque();
        System.out.println("Valor total atualizado: R$ " + valorTotal);

    }
}
