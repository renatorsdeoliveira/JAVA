package br.com.interfa;

public class PessoaIIn implements Aluno {
	
	private String nome;
	private String Sobre;
	

	public PessoaIIn(String nome, String sobre) {
		super();
		this.nome = nome;
		Sobre = sobre;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobre() {
		return Sobre;
	}


	public void setSobre(String sobre) {
		Sobre = sobre;
	}


	@Override
	public String nomeCompleto() {
		// TODO Auto-generated method stub
		nome = getNome();
		Sobre = getSobre();
		
		
		return nome + ' ' + Sobre;
	} 

}
