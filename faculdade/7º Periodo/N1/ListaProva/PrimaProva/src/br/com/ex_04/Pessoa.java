package br.com.ex_04;

public class Pessoa {
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private int indentidade;
	private int idade;
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, String telefone, String endereco, String cpf, int indentidade, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.indentidade = indentidade;
		this.idade = idade;
	}
	
	public int calculaIdade(int anoAtual, int anoNasc) {
		return anoNasc;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIndentidade() {
		return indentidade;
	}
	public void setIndentidade(int indentidade) {
		this.indentidade = indentidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	


}
