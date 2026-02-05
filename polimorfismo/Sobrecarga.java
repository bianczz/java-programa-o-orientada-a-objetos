package polimorfismo;
//Sobrecarga com a mesma classe o mesmo nome metodo mas com assinaturas() diferentes
public class Sobrecarga {
	public int soma() {
		int n1=5, n2=10;
		return n1+n2;
	}
	
	public int soma(int x) {
		int n1=5;
		return n1+x;
	}
	public int soma(int x, int y) {
		return x+y;
	}
	//não é possivel fazer mais de um metodo com o mesmo nome com a mesma assinatura
	public double soma(double x, int y) {
		return x+y;
	}
	public double soma(int x, double y) {
		return x+y;
	}
}
