package br.com.CursoModelo;

public class CursoEspecializado extends Curso{
	
	private boolean latosansu;
	private double adicionalDiploma;

	public CursoEspecializado(boolean latosansu, double adicionalDiploma, double ValorTotal) {
		super();
		this.latosansu = latosansu;
		this.adicionalDiploma = adicionalDiploma;
		
	}

	public CursoEspecializado(int codigo, int cargaHoraria, int sala, int quantiadeAlunos, String nome,
			double valorCurso, double valorTotal) {
		super(codigo, cargaHoraria, sala, quantiadeAlunos, nome, valorCurso, valorTotal);
		// TODO Auto-generated constructor stub
	}

	public CursoEspecializado() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLatosansu() {
		return latosansu;
	}

	public void setLatosansu(boolean latosansu) {
		this.latosansu = latosansu;
	}

	public double getAdicionalDiploma() {
		return adicionalDiploma;
	}

	public void setAdicionalDiploma(double adicionalDiploma) {
		this.adicionalDiploma = adicionalDiploma;
	}
		
	public void adicional (){
		
		double valor = 0;
		if (getQuantiadeAlunos() > 0 || getQuantiadeAlunos() <=10){
			valor =  (getQuantiadeAlunos() * 25);
		} else if (getQuantiadeAlunos() <=30){
			valor =  (getQuantiadeAlunos() * 20);
		} else if (getQuantiadeAlunos() >30){
			valor =  (getQuantiadeAlunos() * 18);
		}
		setAdicionalDiploma(valor);
		setValorTotal(valor + getValorCurso());
	}

	@Override
	public String toString() {
		return "------- Curso Especializado -------\n"
		
				
				
				+ "\nCodígo:  " + getCodigo() 
				+ "\nNumero da sala: " + getSala() 
				+ "\nNome aluno: " + getNome()
				+ "\nNome PRofessor: " + getNomeProfessor() 
				+ "\nCargar Horaria: "+ getCargaHoraria()
				+ "\nValor do Curso: "+ getValorCurso() 
//				+ "\nisLatosansu()=" + isLatosansu()
				+ "\nQuantidade de Alunos: " + getQuantiadeAlunos()
				+ "\nValor adicionado: " + getAdicionalDiploma()
				+ "\nValor Total: " + getValorTotal();
				
	}

}
