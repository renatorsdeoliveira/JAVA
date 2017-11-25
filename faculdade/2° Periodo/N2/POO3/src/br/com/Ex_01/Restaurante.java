package br.com.Ex_01;

import java.util.ArrayList;

public class Restaurante {

	private ArrayList <Mesa> mesa;
	private double faturamento;
	public Restaurante() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurante(ArrayList<Mesa> mesa, double faturamento) {
		super();
		this.mesa = mesa;
		this.faturamento = faturamento;
	}
	public ArrayList<Mesa> getMesa() {
		return mesa;
	}
	public void setMesa(ArrayList<Mesa> mesa) {
		this.mesa = mesa;
	}
	public double getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	
}
