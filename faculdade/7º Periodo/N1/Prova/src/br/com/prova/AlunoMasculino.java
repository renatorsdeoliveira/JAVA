package br.com.prova;


public class AlunoMasculino extends Aluno{
	
	private String identidadeMilitar;


	public AlunoMasculino() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AlunoMasculino(String identidadeMilitar) {
		super();
		this.identidadeMilitar = identidadeMilitar;
	}
	


	public AlunoMasculino(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, char genero,
			Notas notas, String situaçãoResultado) {
		super(codigo, idade, nome, cpf, endereco, sexo, genero, notas, situaçãoResultado);
		// TODO Auto-generated constructor stub
	}


	public String getIdentidadeMilitar() {
		return identidadeMilitar;
	}

	public void setIdentidadeMilitar(String identidadeMilitar) {
		this.identidadeMilitar = identidadeMilitar;
	}
	
	public String  Situacao(){


		
		Notas n = new Notas();
		
		String 	msg = "";
		
		if ( getNotas().getResultadaMedia() < 6.0){

			msg	+="\nSituação: REPROVADO "
			+"\nCom a nota: "+getNotas().getResultadaMedia();
			return msg;
		}else if (getNotas().getResultadaMedia() >= 6.0){
	
			msg += "\nSituação: APROVADO "
			+"\nCom a nota: "+getNotas().getResultadaMedia();
			return msg;
		}else{
			return msg;	
		}
			

	}
	public String toString() {
		return "AlunoMasculino "+
				"\nNome: " + getNome() + 
				"\nCodigo: " + getCodigo() + 
				"\nIdentidade Militar:" + identidadeMilitar + 
				"\nIdade: " + getIdade() +
				"\nCpf: " + getCpf() + 
				"\nEndereco: " + getEndereco()+
				"\nSexo: " + "Masculino"+
				 Situacao();
	
				 
	}

		

}
