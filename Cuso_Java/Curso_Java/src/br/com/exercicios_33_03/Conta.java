package br.com.exercicios_33_03;

import javax.swing.JOptionPane;

public class Conta {
	
	private int idade;

	public Conta(int idade) {
		super();
		this.idade = idade;
	}

	public Conta() {
		
	}
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public String toString() {
		return "Conta [idade=" + idade + ", getIdade()=" + getIdade() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}