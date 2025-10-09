package revisao_p1.prova_tipoC.exercicio07.view;

import revisao_p1.prova_tipoC.exercicio07.model.ContaBancaria;

public class Main {
     public static void main(String[] args) {
    
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Geovanny");
        conta1.setNumeroConta(2032);
        conta1.setSaldo(3489000.90);

        System.out.println("Titular da conta: " + conta1.getTitular());
        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo da conta: R$" + String.format("%.2f", conta1.getSaldo()));
}
}
