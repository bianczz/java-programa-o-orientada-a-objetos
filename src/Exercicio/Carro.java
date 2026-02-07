package Exercicio;

public class Carro implements Veiculo {
	
	private int acel;
	private boolean carroacelerado;
	private boolean ligado;
	//private int marcha;

	@Override
	public void ligar() {
		if(this.ligado==true)
			System.out.println("O carro já está ligado");
		else
			this.ligado=true;
			System.out.println("O carro está ligado!");
	}

	@Override
	public void desligar() {
		if(this.ligado==false)
			System.out.println("O carro já esta desligado");
		else
			this.ligado=false;
			System.out.println("O carro desligou!");
		
	}

	@Override
	public void acelerar() {
		if(this.carroacelerado==true || this.acel==150)
			System.out.println("O carro ta no máximo sendo acelerado");
		else
			this.acel+=50;
			System.out.println("Acelerando o carro!");
	}
		

	@Override
	public void freiar() {
		if(this.carroacelerado==false || this.acel==0)
			System.out.println("O carro já está parada");
		else
			this.acel-=25;
			System.out.println("O carro está freiando");
		
	}

	@Override
	public void trocarMarcha(int marcha) {
		if(this.ligado==false)
			System.out.println("Ligue o carro para começar");
		else
			System.out.println("Trocando de marcha");
			
			

			//if(this.acel>0 && this.acel<=10);
				//this.marcha=1;
			//else if(this.acel>10 && this.acel<=30)
				//this.marcha=2;
			//else if(marcha==3 || this.acel>30);
				//this.marcha=marcha;
			//else if(marcha==4 || this.acel>50);
			//this.marcha=marcha;
				
//&& and e || or		
	}

	public int getAcel() {
		return acel;
	}

	public boolean isLigado() {
		return ligado;
	}

}
