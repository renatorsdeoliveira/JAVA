package br.com.FormaGeometricaModelo;

import javax.swing.JOptionPane;

public class Circulo implements FiguraGeometrica{

	private double raio;
	
	
	public Circulo() {
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
	public double area() {
		
		return (Math.PI *(Math.pow(raio, 2)));
	}

	@Override
	public double perimentro() {
		
		return (2  * Math.PI * raio);
	}
	
	public double caulculo() {
		double cal;
		cal = perimentro()* area();
		return cal;
	}

	@Override
	public String exibirDados() {
		return "----- CIRCULO -----\n\n" + 
		"RAIO: " + getRaio() +
		"\nAREA: " +area()+
		"\nPERIMETRO: "+ perimentro() +
		"\nCALCULO DO QUADRADO" + caulculo();
	}
}
