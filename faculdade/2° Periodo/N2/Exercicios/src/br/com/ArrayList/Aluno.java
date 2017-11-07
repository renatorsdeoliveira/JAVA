package br.com.ArrayList;

public class Aluno {

	private String nome;
	private int matricula;
	private double n1;
	private double n2;
	public Aluno(String nome, int matricula, double n1, double n2) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public String toString()
	{
		return "Nome: "+getNome()+
			   "\nMatricula: "+getMatricula()+
			   "\nNota Bimestre 1: "+getN1()+
			   "\nNota Bimestre 2: "+getN2();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	
}
