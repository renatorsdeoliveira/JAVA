package br.com.heranca;

public class Vendedor extends Empregado{
	
	private double valorVendas;
	private int qdtVendas;
	
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendedor(double salario, String matricula) {
		super(salario, matricula);
		// TODO Auto-generated constructor stub
	}
	public Vendedor(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}
	public Vendedor(double valorVendas, int qdtVendas) {
		super();
		this.valorVendas = valorVendas;
		this.qdtVendas = qdtVendas;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getQdtVendas() {
		return qdtVendas;
	}
	public void setQdtVendas(int qdtVendas) {
		this.qdtVendas = qdtVendas;
	}
	
	
	@Override
	public String toString() {
		return "VENDEDOR \n"
				+ "Nome: " + getNome() + "\n"
				+ "Salario: " + getSalario() + "\n"
				+ "Valor Vendas: " + valorVendas + "\n"
				+ "Quantidade de Vendas: " + qdtVendas + "";
	}
	
	
	

}
