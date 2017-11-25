package br.com.Ex_03;

public class Endereco {
	
	private String logradouro;
	private String cidade;
	private String estado;

	public Endereco(String logradouro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public Endereco() {
		super();
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
