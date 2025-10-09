package revisao_p1.prova_tipoB.exercicio07.view;

import revisao_p1.prova_tipoB.exercicio07.model.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
        func1.setNome("Geovanny");
        func1.setSalario(12500);
        func1.setCargo("Mecanico Automotivo");

        System.out.println("Nome do funcionário: " + func1.getNome());
        System.out.println("Salário do funcionário: R$" + func1.getSalario());
        System.out.println("Cargo do funcionário: " + func1.getCargo());
    }
}
