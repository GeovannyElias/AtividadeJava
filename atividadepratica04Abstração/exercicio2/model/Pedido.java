package model;

public class Pedido {
    public String item;

    public void adicionarItem(){
        System.out.println("Um cliente adicionou um " + item + " no carrinho");
    }
}
