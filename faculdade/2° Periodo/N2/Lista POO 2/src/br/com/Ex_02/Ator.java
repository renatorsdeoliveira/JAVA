package br.com.Ex_02;

public class Ator {
	private String nome;
	private int idade;
	private int n_oscars;
	
	
	public Ator() {
		
	}


	public Ator(String nome, int idade, int n_oscars) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.n_oscars = n_oscars;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getN_oscars() {
		return n_oscars;
	}


	public void setN_oscars(int n_oscars) {
		this.n_oscars = n_oscars;
	}
	
	
	

}
