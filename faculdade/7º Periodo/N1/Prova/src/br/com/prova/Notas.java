package br.com.prova;

public class Notas {

	private double n1;
	private double n2;
	private double n3;
	private double media;
	private String situacao;
	
	
	public Notas(double n1, double n2, double n3, double media, String situacao) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.media = media;
		this.situacao = situacao;
	}
	public Notas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getMedia() {
		return media;
	}
	
	public String getSituacao() {
		
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
		
	}
	public void setMedia(double n1, double n2, double n3) {
		double media = (n1 + n2 + n3) / 3;
		
		if(media  >= 6 && getMedia() < 10) {
			setSituacao("Aprovado");
		}
		else {
			setSituacao("Reprovado");
		}
		this.media = media;
	}
	
	@Override
	public String toString() {
		return "\n\nNotas ----"
				+"\nN1: " + n1 +
				"\nN2: " + n2 + 
				"\nN3: " + n3 ;
	}

	
	
	
	
}
