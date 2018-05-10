package br.com.FormaGeometricaModelo;

import javax.swing.JOptionPane;

public class Retangulo implements FiguraGeometrica {

	private double base,altura;
	
	
	public Retangulo() {
		// TODO Auto-generated constructor stub
	}
	public Retangulo(double base, double altura) {
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
	public double area() {
				
		return base * altura;
	}

	@Override
	public double perimentro() {
		
		return (2 * base) + (2 * altura);
	}

	public double caulculo() {
		double cal;
		cal = perimentro()* area();
		return cal;
	}

	@Override
	public String exibirDados() {
		return "----- CIRCULO -----\n\n" + 
		"ALTURA: " + getAltura() +
		"\nBASE: " +getBase()+
		"\nAREA: " +area()+
		"\nPERIMETRO: "+ perimentro() +
		"\nCALCULO DO QUADRADO" + caulculo();
	}	

	
	

}
