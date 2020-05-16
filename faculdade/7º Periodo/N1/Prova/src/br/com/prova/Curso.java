package br.com.prova;

import java.util.ArrayList;


public class Curso {
	private int codigo;
	private int cargaHoraria;
	private int sala;
	private String nomeProfessor;
	private double valorCurso;
	private ArrayList<Aluno> alunos;
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(int codigo, int cargaHoraria, int sala, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos) {
		super();
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.sala = sala;
		this.nomeProfessor = nomeProfessor;
		this.valorCurso = valorCurso;
		this.alunos = alunos;
	}
	public Curso(int codigo, int cargaHoraria, int sala, String nomeProfessor, double valorCurso) {
		super();
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.sala = sala;
		this.nomeProfessor = nomeProfessor;
		this.valorCurso = valorCurso;

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
	
	
}
