package br.com.interce;

public class Circulo implements FormaGeografica{

	private double raio;
	

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}

}
