package br.com.prova;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso implements AddDiploma{
	private boolean latoSensu;
	private double adicionalDiploma;
	@Override
	public double adicionalDiploma() {
		// TODO Auto-generated method stub
		return 0;
	}
	public CursoEspecializacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CursoEspecializacao(int codigo, int cargaHoraria, int sala, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos) {
		super(codigo, cargaHoraria, sala, nomeProfessor, valorCurso, alunos);
		// TODO Auto-generated constructor stub
	}
	public CursoEspecializacao(boolean latoSensu, double adicionalDiploma) {
		super();
		this.latoSensu = latoSensu;
		this.adicionalDiploma = adicionalDiploma;
	}
	public boolean isLatoSensu() {
		return latoSensu;
	}
	public void setLatoSensu(boolean latoSensu) {
		this.latoSensu = latoSensu;
	}
	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}
	public void setAdicionalDiploma(double adicionalDiploma) {
		this.adicionalDiploma = adicionalDiploma;
	}
	
	

}
