package br.com.dado;

import java.util.Random;

public class Pessoa {
	
	private String nome;
	private Dado meuDado;

	

	public Pessoa() {
		this.meuDado = new Dado(6);
		
	}
	public Pessoa(String nome) {
		this.nome = nome;
		this.meuDado = new Dado(6);
	}
	public Pessoa(String nome, int qdtLados) {
		this.nome = nome;
		this.meuDado = new Dado(qdtLados);
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Dado getMeuDado() {
		return meuDado;
	}

	public void setMeuDado(Dado meuDado) {
		this.meuDado = meuDado;
	}



	public int jogarDado() {
		Random rd = new Random();
		return rd.nextInt(meuDado.getQdtLados()) + 1;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", meuDado=" + meuDado + ", getNome()=" + getNome() + ", getMeuDado()="
				+ getMeuDado() + ", jogarDado()=" + jogarDado() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
	
}
