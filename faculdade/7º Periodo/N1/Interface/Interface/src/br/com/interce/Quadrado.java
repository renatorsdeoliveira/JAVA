package br.com.interce;

public class Quadrado implements FormaGeografica {

	private double lado;
	

	public Quadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return  4*lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	

}
