package br.com.ex_02;

import javax.swing.JOptionPane;

public class Compra {

	private Pessoa pessoa;
	private Produto produto;

	Compra(Pessoa pessoa, Produto produto) {
		super();
		this.pessoa = pessoa;
		this.produto = produto;
	}
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void verificaCompra(){
		int continuar;
		continuar  = JOptionPane.showConfirmDialog(null, "Deseja confirmar a compra?");
		
		if(continuar == 0){
			JOptionPane.showMessageDialog(null, "COMPRA REALIZADA COM SUCESSO!\nem 20 dias chegar� em sua residencia");
		}else{
			JOptionPane.showMessageDialog(null, "COMPRA CANCELADA!");

		}
	}

}
