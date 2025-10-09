package revisao_p1.prova_tipoC.exercicio06.view;

import revisao_p1.prova_tipoC.exercicio06.model.Celular;

public class Main {
     public static void main(String[] args) {
    Celular celular1 = new Celular();
    celular1.marca = "Xiaomi";
    celular1.modelo = "Poco F7";
    celular1.preco = 2459.99;

    System.out.println("Marca do celular: " + celular1.marca);
    System.out.println("Modelo do celular: " + celular1.modelo);
    System.out.println("Preço do celular: " + celular1.preco);
}
}
