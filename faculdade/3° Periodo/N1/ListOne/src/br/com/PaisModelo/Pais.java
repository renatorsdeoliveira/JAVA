package br.com.PaisModelo;

import java.util.ArrayList;

public class Pais {
	
	String nome,capital;
	double dimensao;
	ArrayList<String> fronteira;
	
	public Pais() {
		
		
	}

	public Pais(String nome, String capital, double dimensao, ArrayList<String> fronteira) {
		super();
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
		this.fronteira = fronteira;
	}
	
	

	public Pais(String nome, String capital, double dimensao) {
		super();
		this.nome = nome;
		this.capital = capital;
		this.dimensao = dimensao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public ArrayList<String> getFronteira() {
		return fronteira;
	}

	public void setFronteira(ArrayList<String> fronteira) {
		this.fronteira = fronteira;
	}

	@Override
	public String toString() {
		return "País [nome=" + nome + ", capital=" + capital + ", dimensao=" + dimensao + ", fronteira=" + fronteira
				+ "]";
	}
	
	
	
	

}
