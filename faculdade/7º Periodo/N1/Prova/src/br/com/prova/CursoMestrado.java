package br.com.prova;

import java.util.ArrayList;

public class CursoMestrado extends Curso implements AddDiploma{
	
	private boolean strictoSensu;;
	private double adicionalDiploma;
	
	
	@Override
	public double adicionalDiploma() {
		// TODO Auto-generated method stub
		return 0;
	}


	public CursoMestrado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CursoMestrado(int codigo, int cargaHoraria, int sala, String nomeProfessor, double valorCurso,
			ArrayList<Aluno> alunos) {
		super(codigo, cargaHoraria, sala, nomeProfessor, valorCurso, alunos);
		// TODO Auto-generated constructor stub
	}


	public CursoMestrado(boolean strictoSensu, double adicionalDiploma) {
		super();
		this.strictoSensu = strictoSensu;
		this.adicionalDiploma = adicionalDiploma;
	}


	public boolean isStrictoSensu() {
		return strictoSensu;
	}


	public void setStrictoSensu(boolean strictoSensu) {
		this.strictoSensu = strictoSensu;
	}


	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}


	public void setAdicionalDiploma(double adicionalDiploma) {
		this.adicionalDiploma = adicionalDiploma;
	}
	



}
