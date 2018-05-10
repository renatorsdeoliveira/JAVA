package br.com.CursoModelo;

public class CursoMestrado extends Curso{
	
	private boolean strictoSensu;
	private double adicionalDiploma;
	
	public CursoMestrado(boolean strictoSensu, double adicionalDiploma) {
		super();
		this.strictoSensu = strictoSensu;
		this.adicionalDiploma = adicionalDiploma;
	}

	public CursoMestrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CursoMestrado(int codigo, int cargaHoraria, int sala, int quantiadeAlunos, String nome, double valorCurso, double valorTotal) {
		super(codigo, cargaHoraria, sala, quantiadeAlunos, nome, valorCurso,  valorTotal);
		// TODO Auto-generated constructor stub
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
	
//	public String sansu(){
//		String msg = null;
//		if(isStrictoSensu() == true){
//			 msg = "Cusrso Sensu";
//			setStrictoSensu(true);
//		}
//		else if (isStrictoSensu() == false){
//			 msg = "Cusrso não Sensu";
//		}
//		return msg;
//	}
//	
	public void adicional(){
		
		double valor = 0;
		if ( getQuantiadeAlunos() > 0 || getQuantiadeAlunos() <=5){
			valor =  (getQuantiadeAlunos() * 45);
		} else if (getQuantiadeAlunos() <=15){
			valor =  (getQuantiadeAlunos() * 43);
		} else if (getQuantiadeAlunos() <=30){
			valor = (getQuantiadeAlunos() * 40) ;
		}else if (getQuantiadeAlunos() >30){
			valor = (getQuantiadeAlunos() * 36) ;
		}
		setAdicionalDiploma(valor);
		setValorTotal(valor + getValorCurso());
	}
	@Override
	public String toString() {
		return "------- Curso Mestrado -------\n"
		
				
				
				+ "\nCodígo:  " + getCodigo() 
				+ "\nNumero da sala: " + getSala() 
				+ "\nNome aluno: " + getNome()
				+ "\nNome Poofessor: " + getNomeProfessor() 
				+ "\nCargar Horaria: "+ getCargaHoraria()
				+ "\nValor do Curso: "+ getValorCurso() 
//				+ "\nisLatosansu()=" + isLatosansu()
				+ "\nQuantidade de Alunos: " + getQuantiadeAlunos()
				+ "\nValor adicionado: " + getAdicionalDiploma()
				+ "\nValor Total: " + getValorTotal();
				
	}
	

}

	