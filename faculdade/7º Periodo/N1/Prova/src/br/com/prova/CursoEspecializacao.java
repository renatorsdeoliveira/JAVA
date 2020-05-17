package br.com.prova;

import java.util.ArrayList;

public class CursoEspecializacao extends Curso implements AddDiploma{
	private boolean latoSensu;
	private double adicionalDiploma;
	private int qdtAlunus;
	private double valorEspecia;
	private double tatalCursoEspecializacao;
	
	@Override
	public double adicionalDiploma() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public CursoEspecializacao(boolean latoSensu, double adicionalDiploma, int qdtAlunus, double valorEspecia,
			double tatalCursoEspecializacao) {
		super();
		this.latoSensu = latoSensu;
		this.adicionalDiploma = adicionalDiploma;
		this.qdtAlunus = qdtAlunus;
		this.valorEspecia = valorEspecia;
		this.tatalCursoEspecializacao = tatalCursoEspecializacao;
	}

	public CursoEspecializacao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CursoEspecializacao(int codigo, int cargaHoraria, int sala, String nomeCurso, String nomeProfessor,
			double valorCurso, ArrayList<Aluno> alunos) {
		super(codigo, cargaHoraria, sala, nomeCurso, nomeProfessor, valorCurso, alunos);
		// TODO Auto-generated constructor stub
	}

	public int getQdtAlunus() {
		return qdtAlunus;
	}


	public void setQdtAlunus(int qdtAlunus) {
		this.qdtAlunus = qdtAlunus;
	}


	public double getValorEspecia() {
		return valorEspecia;
	}


	public void setValorEspecia(double valorEspecia) {
		this.valorEspecia = valorEspecia;
	}


	public double getTatalCursoEspecializacao() {
		return tatalCursoEspecializacao;
	}


	public void setTatalCursoEspecializacao(double tatalCursoEspecializacao) {
		this.tatalCursoEspecializacao = tatalCursoEspecializacao;
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
	
	public void AdicionalDisciplina (){
		
		double vf;
		if(getQdtAlunus()<=10){
			 vf = getQdtAlunus() * 25;
			setValorEspecia(vf);
			
		}else if(getQdtAlunus()<=30){
			vf = getQdtAlunus() * 20;
			setValorEspecia(vf);
			
		}else if(getQdtAlunus()>30){
			vf = getQdtAlunus() * 18;
			setValorEspecia(vf);
		}		
		
		double totalPagar = getValorCurso() + getValorEspecia();
		setTatalCursoEspecializacao(totalPagar);
	}

	@Override
	public String toString() {
		return   ""
				+ "\nCodigo do Curso: " + getCodigo() 
				+ "\nCarga Horaria: "+ getCargaHoraria()
				+ "\nSala: " + getSala() 
				+ "\nQuantidade de Alunos: " + getQdtAlunus()
				+ "\nNome Professor: "+ getNomeProfessor() 
				+ "\nValor Curso: " + getValorCurso()
				+ "\nAdicional Diploma: "+ getValorEspecia() 
				+ "\nTotal a pagar: " + getTatalCursoEspecializacao();

	}



}
	