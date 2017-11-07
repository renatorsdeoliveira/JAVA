package br.com.Ex_02;

public class Diretor {

	private String nome;
	private boolean ganhador_oscar;
	private String principal_filme;
	
	
	public Diretor() {
		
	}
	public Diretor(String nome, boolean ganhador_oscar, String principal_filme) {
		super();
		this.nome = nome;
		this.ganhador_oscar = ganhador_oscar;
		this.principal_filme = principal_filme;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isGanhador_oscar() {
		return ganhador_oscar;
	}
	public void setGanhador_oscar(boolean ganhador_oscar) {
		this.ganhador_oscar = ganhador_oscar;
	}
	public String getPrincipal_filme() {
		return principal_filme;
	}
	public void setPrincipal_filme(String principal_filme) {
		this.principal_filme = principal_filme;
	}
	
	
	
	
	
	
}
