package br.com.heranca;

public class Empregado extends Pessoa {
	
	private double salario;
	private String  matricula;
	
	public double valorInss(double salario ) {
		return  salario * 0.11;
	}

	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empregado(String nome, int idade, String sexo) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empregado(double salario, String matricula) {
		super();
		this.salario = salario;
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Empregado \n"
				+ "Nome: " + getNome() + "\n"
				+ "Idade: " + getIdade() + "\n"
				+ "Sexo: " + getSexo() + "\n"
				+ "Salario: " + salario + "\n"
				+ "Matricula: " + matricula + "";
	}
	
	
	

}
