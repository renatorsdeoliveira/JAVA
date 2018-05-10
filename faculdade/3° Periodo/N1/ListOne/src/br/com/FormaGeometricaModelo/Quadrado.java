package br.com.FormaGeometricaModelo;

import javax.swing.JOptionPane;

public class Quadrado implements FiguraGeometrica {

	 private double lado;
	
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	

	public Quadrado() {
		// TODO Auto-generated constructor stub
	}



	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double area() {
		
		return lado * lado;
	}

	@Override
	public double perimentro() {
		
		return lado * 4;
	}
	
	public double caulculo() {
		double cal;
		cal = perimentro()* area();
		return cal;
	}


	@Override
	public String exibirDados() {
		return "----- QUADRADO -----\n\n" + 
		"LADO: " + getLado() +
		"\nAREA: " + area() + 
		"\nPERIMETRO: "+ perimentro() +
		"\nCALCULO DO QUADRADO" + caulculo();
	}

}
