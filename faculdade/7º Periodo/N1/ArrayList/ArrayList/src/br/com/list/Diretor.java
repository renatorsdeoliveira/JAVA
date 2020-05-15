package br.com.list;


public class Diretor {

	private String nome;
	private boolean ganhador_oscar;
	private Filme principal_filme;
	
	public Diretor()
	{
		
	}
	public Diretor(String nome, boolean ganhador_oscar)
	{
		super();
		this.nome = nome;
		this.ganhador_oscar = ganhador_oscar;
	}
	public Diretor(String nome, boolean ganhador_oscar, Filme principal_filme) {
		super();
		this.nome = nome;
		this.ganhador_oscar = ganhador_oscar;
		setPrincipal_filme(principal_filme);
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
	public Filme getPrincipal_filme() {
		return principal_filme;
	}
	public void setPrincipal_filme(Filme principal_filme) {
		this.principal_filme = principal_filme;
	}
	
	@Override
	public String toString() {
		return "Diretor [nome=" + nome + ", principal_filme=" + principal_filme.getTitulo() + "]";
	}
	

}
