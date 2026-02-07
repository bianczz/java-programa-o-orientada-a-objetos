package Exercicio;

public class Moto implements Veiculo{
	
	private int acel;
	private boolean motoacelerada;
	private boolean ligado;

	@Override
	public void ligar() {
		if(this.ligado==true)
			System.out.println("O moto já está ligada");
		else
			this.ligado=true;
			System.out.println("Ligando a moto!");
	}

	@Override
	public void desligar() {
		if(this.ligado==false)
			System.out.println("O moto já está desligada");
		else
			this.ligado=false;
			System.out.println("Desligando a moto!");
		
	}

	@Override
	public void acelerar() {
		if(this.motoacelerada==true || this.acel==200)
			System.out.println("A moto já está no máximo acelerada");
		else
			this.acel+=50;
		
	}

	@Override
	public void freiar() {
		if(this.motoacelerada==false && this.acel==0)
			System.out.println("A moto já está parada");
		else
			this.acel-=50;
		
		
	}

	@Override
	public void trocarMarcha() {
		System.out.println("Trocando de marcha");
		
	}

	public int getAcel() {
		return acel;
	}

}
