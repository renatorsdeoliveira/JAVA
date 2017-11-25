package br.com.Heranca;

import java.util.ArrayList;

public class Turma {

	String nome;
	Professor professor;
	ArrayList <Aluno> alunos;
	
	public Turma(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
		this.alunos = new ArrayList<Aluno>();
		
	}

	public Turma(String nome, Professor professor, ArrayList<Aluno> alunos) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
	}
	
	public String toString()
	{
		String msg="";
		
		msg += "Turma: "+this.nome+"\n";
		msg += "Professor: "+this.professor.getNome()+"\nLista de Alunos:\n";
		for(Aluno a : this.alunos)
		{
			msg += "- "+a.getNome()+"\n";
		}
		
		
		return msg;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void adicionaAluno(Aluno a)
	{
		this.alunos.add(a);
	}
}
