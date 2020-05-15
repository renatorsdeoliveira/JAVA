package br.com.heranca;

public class Gerente extends Empregado{
	
	private String nomeGerente;

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(double salario, String matricula) {
		super(salario, matricula);
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nomeGerente) {
		super();
		this.nomeGerente = nomeGerente;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}

	@Override
	public String toString() {
		return "GERENTE \n"
				+ "Nome: " + getNome() + "\n"
				+ "Idade: " + getIdade() + "\n"
				+ "Sexo: " + getSexo() + "\n"
				+ "Salario: " + getSalario() + "\n"
				+ "Nome gerente: " + nomeGerente + "\n"
				+ "Valor Inss: " + valorInss(getSalario()) + "";
	}


	
	

}
