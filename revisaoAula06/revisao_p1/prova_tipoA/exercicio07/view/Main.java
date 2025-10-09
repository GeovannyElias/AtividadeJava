package exercicio07.view;

import exercicio07.model.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Geovanny");
        aluno1.setMatricula("j1337gpr22");
        aluno1.setNotaFinal(9.5, 7.75, 10);

        System.out.println("Nome do Aluno: " + aluno1.getNome());
        System.out.println("Matricula do Aluno: " + aluno1.getMatricula());
        System.out.println("Nota Final do Aluno: " + String.format("%.2f", aluno1.getNotaFinal()));
    }
}
