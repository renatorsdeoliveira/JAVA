package br.com.Ex_04;

public class Quadrado {

	private double lado;
	private double area;
	

	public void Quadrado() {
		
		
	}
	public Quadrado(double lado, double area) {
	
		this.lado = lado;
		this.lado = area;
		
	}
	
	
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double  area(double lado){
		double area;
		area = Math.pow(getLado(), 2.0);
		return area;
	}
	public double perimetro(double lado){
		double perimetro;
		perimetro = 4 * getLado();
		return perimetro;	
	}

}
