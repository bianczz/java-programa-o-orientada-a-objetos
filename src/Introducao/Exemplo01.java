package Introducao;

public class Exemplo01 {

	public static void main(String[] args) {
		Caneta bic = new Caneta("Preta",0.5);
		Caneta montblanc = new Caneta("Azul", 2.0);
		System.out.println("Caneta bic");
		double x=bic.getPonta();
		x+=5;
		System.out.println("A ponta da caneta bic é: "+x);
		
		System.out.println("\nCaneta montblac");
		montblanc.destampar();
		montblanc.escrever();
		montblanc.setCarga(200);
		montblanc.estado();

		
		
		
	}

}
