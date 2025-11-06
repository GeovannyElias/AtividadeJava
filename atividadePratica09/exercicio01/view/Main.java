package atividadePratica09.exercicio01.view;

import atividadePratica09.exercicio01.model.CadastroForm;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new CadastroForm();
        });
    }
}