package Exercicio;

public class Veiculos01 {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		Moto yamaha = new Moto();
		
		fusca.ligar();
		fusca.acelerar();
		System.out.println("O carro está acelerando em "+fusca.getAcel());
		fusca.acelerar();
		System.out.println("O carro está acelerando em "+fusca.getAcel());
		
		yamaha.ligar();
		yamaha.acelerar();
		System.out.println("A moto está acelerando em "+yamaha.getAcel());
		yamaha.freiar();
	}

}
