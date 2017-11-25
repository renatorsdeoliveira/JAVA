package br.com.Ex_01;

import javax.swing.JOptionPane;

public class Pedido {

	private String nome;
	private double valor;
	public Pedido() {
		
	}
	public Pedido(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
		public void escolhaPedido(){
			int escolha;
			double acc = 0;
			do{
				String msg = "Escolha seu Pedido\n\n1 Bolo de chocolate: $10,00\n2 torta Alemã: $9,00\n3 cupcake: $5,00"
						+ "\n\nBEBIDAS\n\n4 Agua: $2,00\n5 Refrigerante: $3,50\n6 Suco: $3,00";
				
				escolha = Integer.parseInt(JOptionPane.showInputDialog(msg));
				if(escolha == 1){
					valor = 10.00;
					acc+=valor;
				}else if(escolha == 2){
					valor = 10.00;
					acc+=valor;
				}
				
			}while(escolha == 0);
			Restaurante restaurante = new Restaurante();
			restaurante.setFaturamento(acc);
		}
}
