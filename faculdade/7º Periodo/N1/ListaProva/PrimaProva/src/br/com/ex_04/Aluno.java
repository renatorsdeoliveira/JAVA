package br.com.ex_04;

public class Aluno extends Pessoa{
	private int matricula;

	Notas notaAlino = new Notas();
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String telefone, String endereco, String cpf, int indentidade, int idade, double n1, double n2, double n3) {
		super(nome, telefone, endereco, cpf, indentidade, idade);
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
