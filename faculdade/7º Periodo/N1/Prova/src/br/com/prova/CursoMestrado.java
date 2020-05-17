package br.com.prova;

import java.util.ArrayList;

public class CursoMestrado extends Curso implements AddDiploma{
	
	private boolean strictoSensu;;
	private double adicionalDiploma;
	private int qdtAlunosMestrado;
	private double valorMestrado;
	private double totalCursoMestrado;
	
	@Override
	public double adicionalDiploma() {
		// TODO Auto-generated method stub
		return 0;
	}


	public CursoMestrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CursoMestrado(boolean strictoSensu, double adicionalDiploma, int qdtAlunosMestrado, double valorMestrado,
			double totalCursoMestrado) {
		super();
		this.strictoSensu = strictoSensu;
		this.adicionalDiploma = adicionalDiploma;
		this.qdtAlunosMestrado = qdtAlunosMestrado;
		this.valorMestrado = valorMestrado;
		this.totalCursoMestrado = totalCursoMestrado;
	}


	public CursoMestrado(int codigo, int cargaHoraria, int sala, String nomeCurso, String nomeProfessor,
			double valorCurso, ArrayList<Aluno> alunos) {
		super(codigo, cargaHoraria, sala, nomeCurso, nomeProfessor, valorCurso, alunos);
		// TODO Auto-generated constructor stub
	}



	public void AdicionalDisciplinal(){
		
		double vf;
		if(getQdtAlunosMestrado()<=5){
			vf = getQdtAlunosMestrado() * 45;
			setValorMestrado(vf);
			
		}else if(getQdtAlunosMestrado()<=15){
			 vf = getQdtAlunosMestrado() * 43;
			 setValorMestrado(vf);
			
		}else if(getQdtAlunosMestrado()<=30){
			 vf = getQdtAlunosMestrado() * 40;
			 setValorMestrado(vf);
		}else{
			 vf = getQdtAlunosMestrado() * 36;
			 setValorMestrado(vf);
		}
	
		double totalPagarMagetrado = getValorCurso() + getValorMestrado();
		setTotalCursoMestrado(totalPagarMagetrado);
	}
	public CursoMestrado(boolean strictoSensu, double adicionalDiploma) {
		super();
		this.strictoSensu = strictoSensu;
		this.adicionalDiploma = adicionalDiploma;
	}



	public int getQdtAlunosMestrado() {
		return qdtAlunosMestrado;
	}



	public void setQdtAlunosMestrado(int qdtAlunosMestrado) {
		this.qdtAlunosMestrado = qdtAlunosMestrado;
	}



	public double getValorMestrado() {
		return valorMestrado;
	}



	public void setValorMestrado(double valorMestrado) {
		this.valorMestrado = valorMestrado;
	}



	public double getTotalCursoMestrado() {
		return totalCursoMestrado;
	}



	public void setTotalCursoMestrado(double totalCursoMestrado) {
		this.totalCursoMestrado = totalCursoMestrado;
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


	
	@Override
	public String toString() {
		return  ""
				+ "\nCódigo: " + getCodigo() 
				+ "\nCarga Horaria: " + getCargaHoraria() 
				+ "\nSala: "+ getSala()
				+ "\nQuantidade de Alunos: " + getQdtAlunosMestrado() 
				+ "\nNome Professor: " + getNomeProfessor()
				+ "\nValor Curso: " + getValorCurso() 
				+ "\nValor Mestrado: " + getValorMestrado()
				+"\nAdicional Diploma: " + getAdicionalDiploma()
				+ "\nTotal a pagar: " + getTotalCursoMestrado();

	}



}
