package br.com.list;

public class Ator {

	private String nome;
	private int idade;
	private int n_oscar;
	
	public Ator(){
		
	}
	public Ator(String nome, int idade, int n_oscar) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.n_oscar = n_oscar;
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
	public int getN_oscar() {
		return n_oscar;
	}
	public void setN_oscar(int n_oscar) {
		this.n_oscar = n_oscar;
	}
	
	
}
