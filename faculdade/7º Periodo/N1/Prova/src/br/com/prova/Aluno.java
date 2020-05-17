package br.com.prova;

import javax.swing.JOptionPane;

public class Aluno {
	private int codigo;
	private int idade;
	private String nome;
	private String cpf;
	private String endereco;
	private boolean sexo;
	private char genero;
	private Notas notas;
	private String SituaçãoResultado;
	

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(int codigo, int idade, String nome, String cpf, String endereco, boolean sexo, char genero,
			Notas notas, String situaçãoResultado) {
		super();
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
		this.genero = genero;
		this.notas = notas;
		SituaçãoResultado = situaçãoResultado;
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



	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public Notas getNotas() {
		return notas;
	}
	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getSituaçãoResultado() {
		return SituaçãoResultado;
	}

	public void setSituaçãoResultado(String situaçãoResultado) {
		SituaçãoResultado = situaçãoResultado;
	}

	
		
	
	@Override
	public String toString() {
		return "\n\nAluno ----"
				+ "\nCodigo: " + codigo 
				+ "\nIdade: " + idade 
				+ "\nNome: " + nome 
				+ "\nCpf: " + cpf 
				+ "\nEndereco: " + endereco 
				+ "\nSexo: " + "Feminino" 
				+ Situacao();
			
	}
	
	
	
	
	
	
}
