package Encapsulamento;
//para referenciar a interface utilizamos implements para a utilização dos metodos
//dica para add todos os metodos clique na classe e add metods
public class Radio implements InterRadio {
	
	private int vol;
	private boolean ligado;
	private double estacao;
	private String frequencia;

	@Override
	public void ligar() {
		if(this.ligado==true)
			System.out.println("Erro! Radioá esta ligado");
		else
			this.ligado=true;
	}

	@Override
	public void desligar() {
		if(this.ligado==false)
			System.out.println("Erro! Radio já esta desligado");
		else
			this.ligado=false;
	}

	@Override
	public void maisVol() {
		if(this.ligado==false || this.vol==100)
			System.out.println("Verifique se o radio esta ligado ou no volume maximo");
		else
			this.vol+=5;
	}

	@Override
	public void menosVol() {
		if(this.ligado==false  || this.vol==0)
			System.out.println("Verifique se o radio esta ligado ou esta no volume 0");
		else
			this.vol-=5;
		
	}

	@Override
	public void trocarEstacao() {
		if(this.ligado==false)
			System.out.println("Ligue o rádio");
		else
			this.estacao+=10;
		
	}

	@Override
	public void frequencia() {
		if(this.frequencia=="AM")
			this.frequencia="FM";
		else
			this.frequencia="AM";
		
	}

	public int getVol() {
		return vol;
	}

	public boolean isLigado() {
		return ligado;
	}

	public double getEstacao() {
		return estacao;
	}

	public String getFrequencia() {
		return frequencia;
	} 
	
}
