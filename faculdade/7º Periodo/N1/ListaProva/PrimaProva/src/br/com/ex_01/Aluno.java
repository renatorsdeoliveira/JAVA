package br.com.ex_01;

public class Aluno {

	private String numMatricula;
	private String nome;
	private double n1;
	private double n2;
	private String situacao;
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String numMatricula, String nome, double n1, double n2) {
		super();
		this.numMatricula = numMatricula;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	
	}


	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

	public double calculaMedia() {
		double media = (n1 +n2)/2;
		return media;
	}

	@Override
	public String toString() {
		return "---- Aluno ----"+ 
				"\nNome: " + nome +
				"\nMatricula: " + numMatricula + 
				"\nN1: " + n1 + 
				"\nN2: " + n2 + 
				"\nSituação: " + situacao + "\n-------------------\n";
	}
	
	
	
}
