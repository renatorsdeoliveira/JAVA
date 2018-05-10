package br.com.CursoModelo;

public class CursoDoutorado extends Curso{
	
	private boolean strictoSensu;
	private int mesesParaDefesa;
	private double adicionalDiploma;
	private int quantidadeAlunos;
	private double valorDesconto;
	private double valorFinal;
	
	

	public CursoDoutorado(boolean strictoSensu, int mesesParaDefesa, double adicionalDiploma, double valorDesconto) {
		super();
		this.strictoSensu = strictoSensu;
		this.mesesParaDefesa = mesesParaDefesa;
		this.adicionalDiploma = adicionalDiploma;
		this.valorDesconto = valorDesconto;
	}


	
	public CursoDoutorado(boolean strictoSensu, int mesesParaDefesa, double adicionalDiploma, int quantidadeAlunos,
			double valorDesconto, double valorFinal) {
		super();
		this.strictoSensu = strictoSensu;
		this.mesesParaDefesa = mesesParaDefesa;
		this.adicionalDiploma = adicionalDiploma;
		this.quantidadeAlunos = quantidadeAlunos;
		this.valorDesconto = valorDesconto;
		this.valorFinal = valorFinal;
	}


	public CursoDoutorado() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CursoDoutorado(int codigo, int cargaHoraria, int sala, int quantiadeAlunos, String nome, double valorCurso,
			double valorTotal) {
		super(codigo, cargaHoraria, sala, quantiadeAlunos, nome, valorCurso, valorTotal);
		// TODO Auto-generated constructor stub
	}



	public boolean isStrictoSensu() {
		return strictoSensu;
	}



	public void setStrictoSensu(boolean strictoSensu) {
		this.strictoSensu = strictoSensu;
	}



	public int getMesesParaDefesa() {
		return mesesParaDefesa;
	}



	public void setMesesParaDefesa(int mesesParaDefesa) {
		this.mesesParaDefesa = mesesParaDefesa;
	}



	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}



	public void setAdicionalDiploma(double adicionalDiploma) {
		this.adicionalDiploma = adicionalDiploma;
	}



	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}



	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}



	public double getValorDesconto() {
		return valorDesconto;
	}



	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}



	public double getValorFinal() {
		return valorFinal;
	}



	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}



	public void adicional(){
		
		double faltam = 0, total = 0;
		
		  if (getMesesParaDefesa() > 0 || getMesesParaDefesa() <=6){
			  setAdicionalDiploma(300);
			faltam = getValorCurso() + 300;
		} else if (getMesesParaDefesa() <=12){
			setAdicionalDiploma(200);
			faltam = getValorCurso() + 200;
		}else if ( getMesesParaDefesa() <=24){
			setAdicionalDiploma(150);
			faltam = getValorCurso() +  150;
		}	else if (getMesesParaDefesa() > 30){
			setAdicionalDiploma(400);
			faltam = getValorCurso() + 400;
		}
	
		 setValorTotal(faltam);
		 
	}
	public void adicionalDiploma (){
		
		double valor= 0, valorFinal = 0;
		if (getQuantiadeAlunos() > 0 || getQuantiadeAlunos() <=3){
			valor =  (getValorTotal() * 0.07) ;
		} else if (getQuantiadeAlunos() <=7) {
			valor =  (getValorTotal() * 0.12);
		} else if (getQuantiadeAlunos() > 7){
			valor = (getValorTotal() * 0.15);
		}
		setValorDesconto(valor);
		valorFinal = getValorTotal() - getValorDesconto();
		setValorFinal(valorFinal);
		
		
	}
	


//	public void setStrictoSensu(String showInputDialog) {
//		String msg = null;
//		boolean s, sim, S, SIM, Sim = true;
//		boolean n, N, não, Não, NÃO = false;
//		if(isStrictoSensu() == true ){
//			 msg = "Cusrso Sensu";
//			setStrictoSensu(msg);
//		}
//		else if (isStrictoSensu() == false){
//			 msg = "Cusrso não Sensu";
//			 setStrictoSensu(msg);
//			 
//		}
//		
//		
//	}

	@Override
	public String toString() {
		return "------- Curso Doutorado -------\n"
				
				+ "\nCodígo:  " + getCodigo() 
				+ "\nNumero da sala: " + getSala() 
				+ "\nNome aluno: " + getNome()
				+ "\nNome professor: " + getNomeProfessor() 
				+ "\nCargar Horaria: "+ getCargaHoraria()
				+ "\nValor do curso: "+ getValorCurso() 
			//	+ "\nModalidade do Curso:" + isStrictoSensu()
				+ "\nQuantidade de alunos: " + getQuantiadeAlunos()
				+ "\nValor Adicionado disciplina: " + getAdicionalDiploma()
				+ "\nValor sem Desconto: " + getValorTotal()
				+ "\nDesconto da disciplina: " + getValorDesconto()
				+ "\nVAlor a pagar com desconto: " +  getValorFinal();

	}

	
	

}
