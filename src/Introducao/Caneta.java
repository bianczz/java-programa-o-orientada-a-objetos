package Introducao;
	//Classificaçao de uma caneta
public class Caneta {
		
	//Caracteristicas -> Atributos : não é o objeto em si
	String cor;
	public double ponta;
	public int carga;
	public boolean tampada;
	
	//Metodo Construtor= regras padrão que vem em toda caneta nesse caso, a cor e a ponta podem mudar
	public Caneta(String cor,double ponta) {
		this.carga=100;
		this.tampada=true;
		this.cor=cor;
		this.ponta=ponta;
	}
	
	//Comportamentos -> Metodos o que essa caneta pode ou não fazer 
	
	public void tampar() {
		if(this.tampada==true)
			System.out.println("Erro... A caneta já esta tampada! ");
		else
			this.tampada=true;
		
	}
	public void destampar() {
		if(this.tampada==false)
			System.out.println("Erro... A caneta esta destampada!");
		else 
			this.tampada=false;
	}
	public void escrever() {
		if(this.tampada==true)
			System.out.println("Erro... a caneta esta tampada!");
		else if(this.carga==0)
			System.out.println("Erro... não há carga na caneta!");
		else
		{
			System.out.println("Escrevendo...");
		this.carga-=5;
		}
	}
	public void estado() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Tampada? "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}
	//vira uma regra na variavel metodo, se a pessoa jogar um valor maior ou menor q 100 em setcarga não consegue 
	public void setCarga(int carga) {
		if(carga>100)
			carga=100;
		if(carga<this.carga)
		this.carga = carga;
	}

	public String getCor() {
		return cor;
	}
//o is tampada funciona tambem
	public boolean getTampada() {
		return tampada;
	}
	
//ENCAPSULAMENTO
//get busca/traz informação print ou fazer alguma logica operacional
//set modifica os dados "montblanc.setCarga(200);"
//interface nao possui atributos, apenas possuem metodos(não possui codigo): todas as classes vão poder usar os mesmos metodos e esses metodos podem ser padrão ou abstratos
}
