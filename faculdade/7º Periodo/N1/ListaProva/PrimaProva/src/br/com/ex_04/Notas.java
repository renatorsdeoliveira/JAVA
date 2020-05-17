package br.com.ex_04;

public class Notas {
	
	private double nota1;
	private double nota2;
	private double nota3;

	public Notas (double n1, double n2, double n3)
	{
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
	}

	public Notas() {
		
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double getMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}

	@Override
	public String toString() {
		return "\n\nNotas: " + 
		"\n\nNota 1: " + getNota1() +
		"\nNota 2: " +getNota2() +
		"\nNota 3: " + getNota3() + 
		"\nMedia = " +getMedia();
	
	}
}
