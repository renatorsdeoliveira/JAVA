package br.com.ex_04;

public class Pessoa {

	private String telefone;
	private String nome;
	private String endereco;
	private String cpf;
	private int identidade;
	private int idade;
	
	public Pessoa(){
		
	}
	public Pessoa (String nome, String telefone, String endereco, String cpf, int identidade, int idade)
	{
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.identidade = identidade;
		this.idade = idade;
	}
	
	public Pessoa (String nome, int identidade)
	{
		this.nome = nome;
		this.identidade = identidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int calculaIdade(int ano_atual, int ano_nasc){
		int cal = ano_atual - ano_nasc;
		return cal;
	}

}
