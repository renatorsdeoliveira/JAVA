package br.com.prova;

import java.util.ArrayList;


public class Curso {
	private int codigo;
	private int cargaHoraria;
	private int sala;
	private String nomeCurso;
	private String nomeProfessor;
	private double valorCurso;
	private ArrayList<Aluno> alunos;
	
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Curso(int codigo, int cargaHoraria, int sala, String nomeCurso, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos) {
		super();
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.sala = sala;
		this.nomeCurso = nomeCurso;
		this.nomeProfessor = nomeProfessor;
		this.valorCurso = valorCurso;
		this.alunos = alunos;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public double getValorCurso() {
		return valorCurso;
	}
	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
				return "\nCurso cadastrado "+
						"\nNome Curso: "+ nomeCurso +
						"\nnome Professor: " + nomeProfessor + 
						"\nCodigo: " + codigo + 
						"\nCarga Horaria: " + cargaHoraria +
						"\nValor Curso: " + valorCurso + 
						"\nSala: " + sala+ "\n\n";
					
	}
	
	
	
}
