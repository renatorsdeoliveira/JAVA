package br.com.prova;

public class AlunoMasculino extends Aluno{
	
	private String identidadeMilitar;

	public AlunoMasculino() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlunoMasculino(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, Notas notas, String identidadeMilitar) {
		super(codigo, idade, nome, cpf, endereco, sexo, notas);
		this.identidadeMilitar = identidadeMilitar;
		// TODO Auto-generated constructor stub
	}
	

	public AlunoMasculino(String identidadeMilitar) {
		super();
		this.identidadeMilitar = identidadeMilitar;
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

		if ( getNotas().getMedia() < 6.0){
			msg	+="\nSituação: REPROVADO "
			+"\nCom a Media: "+getNotas().getMedia();
			return msg;
		}else if (getNotas().getMedia() >= 6.0){
		
			msg += "\nSituação: APROVADO "
			+"\nCom a Media: "+getNotas().getMedia();
			return msg;
		}else{
			return msg;	
		}
	}

	@Override
	public String toString() {
		return "AlunoMasculino "+
				"\nIdentidade Militar:" + identidadeMilitar + 
				"\nCodigo: " + getCodigo() + 
				"\nIdade: " + getIdade() +
				"\nNome: " + getNome() + 
				"\nCpf: " + getCpf() + 
				"\nEndereco: " + getEndereco()+
				"\nSexo: " + "Masculino" + 
				 Situacao();
	
				 
	}
	
	

}
