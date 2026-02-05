package Encapsulamento;

public class ExemploInter01 {
	
	public static void main(String[] args) {
		Radio r = new Radio();
		r.ligar();
		r.maisVol();
		r.trocarEstacao();
		r.frequencia();
		System.out.println("Radio atualizado");
		System.out.println("Volume atual: "+r.getVol());
		System.out.println("Estação atual: " +r.getEstacao());
		System.out.println("Frequencia: "+r.getFrequencia());
	}
}
