package br.com.heranca;

public class Cliente  extends Pessoa {
	
	private double valorDivida;
	private int anoNascim;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nome, int idade, String sexo) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(double valorDivida, int anoNascim) {
			super();
			this.valorDivida = valorDivida;
			this.anoNascim = anoNascim;
	}

	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public int getAnoNascim() {
		return anoNascim;
	}
	public void setAnoNascim(int anoNascim) {
		this.anoNascim = anoNascim;
	}
	
	
	@Override
	public String toString() {
		return "CLIENTE \n"
				+ "Nome: " + getNome() + "\n"
				+ "Idade: " + getIdade() + "\n"
				+ "Sexo: " + getSexo() + "\n"
				+ "Valor da divida: " + valorDivida + "\n"
				+ "Ano de nascimento: " + anoNascim + "\n";
	}
	
	

}
