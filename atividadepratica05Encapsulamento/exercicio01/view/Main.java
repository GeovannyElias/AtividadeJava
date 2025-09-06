package atividadepratica05Encapsulamento.exercicio01.view;
import atividadepratica05Encapsulamento.exercicio01.model.Carro;


public class Main {
    public static void main(String[] args) {
		Carro meuCarro = new Carro("Renaut", "Logan", 2015);// Construtor

		meuCarro.setModelo("Sandero");//Setter do Modelo
		System.out.println(meuCarro.getModelo()); // Getter do Modelo

		int ano = meuCarro.getAno(); //Getter da Ano Pegando o Retorno

		System.out.println(ano);//Impressão da Variavel

		meuCarro.ligar();// Chama Método Ligar
		meuCarro.acelelar();// Chama Método Acelerar

		//Enchendo Tanque
		meuCarro.setCapacidadeTanque(30);
		meuCarro.setTanque(15);

		System.out.println(meuCarro.getCapacidadeTanque());
		System.out.println(meuCarro.getTanque());

		meuCarro.encherTanque(meuCarro.getCapacidadeTanque(), 15, meuCarro.getTanque(), 5);
		System.out.println(meuCarro.getTanque());
	}

}

