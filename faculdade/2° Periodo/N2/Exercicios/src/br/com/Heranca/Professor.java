package br.com.Heranca;

public class Professor extends Pessoa{
	
	String formacao;

	public Professor(String nome, int idade, String formacao) {
		super(nome, idade);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	

}
