package br.com.heranca;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "PESSOA: \n"
				+ "Nome: " + nome + "\n"
				+ "Idade: " + idade + "\n"
				+ "Sexo: " + sexo + "";
	}
	
	
}
