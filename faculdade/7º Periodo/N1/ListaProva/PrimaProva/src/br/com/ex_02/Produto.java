package br.com.ex_02;

public class Produto {

	private long codigo;
	private String nome_produto;
	
	public Produto(long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome_produto = nome;
	}
	
	@Override
	public String toString() {
		
		return " \n " + getCodigo()+ "" + getNome();
	}

	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome_produto;
	}
	public void setNome(String nome) {
		this.nome_produto = nome;
	}
	
	
}
