package br.com.interce;

public class Retanculo implements FormaGeografica {

	private double base,altura;
	
	
	public Retanculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retanculo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*base+2*altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}


}
