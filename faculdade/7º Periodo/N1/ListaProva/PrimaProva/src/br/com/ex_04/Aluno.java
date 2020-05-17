package br.com.ex_04;

public class Aluno extends Pessoa
{

	private int matricula;
	
	Notas notaAluno = new Notas();
	
	public Aluno(){
		
	}
	
	public Aluno(String nome, String telefone, String endereco, String cpf, int identidade, int idade, int matricula, double n1, double n2, double n3) {
		super(nome, telefone, endereco, cpf, identidade, idade);
		this.matricula = matricula;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Notas getNotaAluno() {
		return notaAluno;
	}

	public void setNotaAluno(Notas notaAluno) {
		this.notaAluno = notaAluno;
	}

	public Aluno(String nome, int identidade) {
		super(nome, identidade);
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String telefone, String endereco, String cpf, int identidade, int idade) {
		super(nome, telefone, endereco, cpf, identidade, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n\nAluno:" + "\n\nNome: " +getNome() + 
		"\nTelefone" + getTelefone() + 
		"\nIdentidade: " +getIdentidade() + 
		"\nCPF: " + getCpf() +
		"\nMatricula: " +getMatricula()+
		"\nIdade" + getIdade() ;
	}

	
}
