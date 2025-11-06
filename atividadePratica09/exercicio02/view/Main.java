package atividadePratica09.exercicio02.view;

import atividadePratica09.exercicio02.model.PreferenciasUsuario;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new PreferenciasUsuario();
        });
    }
}
