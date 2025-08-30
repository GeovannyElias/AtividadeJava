package model;

public class ContaBancaria {
    public int numero;

    public void realizarTransferencia(){
        System.out.println("Uma pessoa acabou de realizar uma tranferencia de R$" + numero + " na sua conta");
    }
}
