package model;

public class SistemaOperacional {
    public int memoria;

    public void liberarMemoria(){
        System.out.println("Você tem certeza de quer limpar " + memoria + "mb total?");
    }
}
