package view;
import model.Aplicativo;
import model.Mensagem;

public class Main {
    public static void main(String[] args) {

		Aplicativo Instagram = new Aplicativo();
        Instagram.nome = "Instagram";
        Instagram.instalarAplicativo();

        Aplicativo Facebook = new Aplicativo();
        Facebook.nome = "Facebook";
        Facebook.instalarAplicativo();

        Mensagem João = new Mensagem();
        João.nome = "João Pedro";
        João.enviarCarta();

        Mensagem Caio = new Mensagem();
        Caio.nome = "Caio Edimar";
        Caio.enviarCarta();
	}
}