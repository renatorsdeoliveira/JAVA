package br.com.Ex_03;

import br.com.Ex_03.Endereco;

public class Pessoa {

	private String nome;
	private Endereco endereco;
	private int numero;
	

public Pessoa(String nome, Endereco endereco, int numero) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
	}
//	public Pessoa(String nome, Endereco endereco, int numero) {
//		super();
//		this.nome = nome;
//		setEndereco(endereco);
//		this.end_numero = end_numero;
//	}

	public Pessoa(String nome,int numero) {
	super();
	this.nome = nome;
	
	this.numero = numero;
		
	}
	@Override
	public String toString() {
		return "Nome Cliente: "+getNome()+
				"\nEndereco: "+getEndereco().getLogradouro()+
				"\nCidade: "+endereco.getCidade()+
				"\nEstado: "+endereco.getEstado();
	}

	public String getNome() {
		return nome;
	}

	public void setNome_pessoa(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
