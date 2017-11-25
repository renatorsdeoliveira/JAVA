package br.com.Ex_02;

import br.com.Ex_02.Ator;
import br.com.Ex_02.Diretor;

public class Filme {
	
	private String titulo;
	private Ator ator_principal;
	private Ator atriz_principal;
	private Diretor diretor;
	
	public Filme()
	{
		
	}
	
	public Filme(String titulo, Ator ator_principal, Ator atriz_principal, Diretor diretor) {
		super();
		this.titulo = titulo;
		this.ator_principal = ator_principal;
		this.atriz_principal = atriz_principal;
		this.diretor = diretor;
	}
	
	
	
	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", ator_principal=" + ator_principal.getNome() + ", atriz_principal=" + atriz_principal.getNome()
				+ ", diretor=" + diretor.getNome() + "]";
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Ator getAtor_principal() {
		return ator_principal;
	}
	public void setAtor_principal(Ator ator_principal) {
		this.ator_principal = ator_principal;
	}
	public Ator getAtriz_principal() {
		return atriz_principal;
	}
	public void setAtriz_principal(Ator atriz_principal) {
		this.atriz_principal = atriz_principal;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
}
