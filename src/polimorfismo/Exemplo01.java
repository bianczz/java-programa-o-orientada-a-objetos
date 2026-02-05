package polimorfismo;

public class Exemplo01 {

		public static void main(String[] args) {
			Sobrecarga calc = new Sobrecarga();
			int resp;
			resp=calc.soma();//resp recebe o parametro do metodo soma()
			calc.soma(5, 8);
			System.out.println("O resultado da soma é: "+resp);//esta somando os parametros n1 e n2
			System.out.println("O resultado da soma é: "+calc.soma(8));//ta somando x=5 mais y=8
			System.out.println("O resultado da soma é: "+calc.soma(7,10));
			System.out.println("O resultado da soma é: "+calc.soma(9, 7.8));
		}
}
