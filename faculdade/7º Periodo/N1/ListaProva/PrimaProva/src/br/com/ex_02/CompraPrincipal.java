package br.com.ex_02;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class CompraPrincipal {

	public static void main(String[] args) {
		
		ArrayList<Produto> pd = new ArrayList<Produto>();
		ArrayList<Endereco> ed = new ArrayList<Endereco>();
		ArrayList<Pessoa> ps = new ArrayList<Pessoa>();

		JOptionPane.showMessageDialog(null, "\t\tBem vindo\nclique e vamos as compras!");	
		Pessoa pessoa = new Pessoa(JOptionPane.showInputDialog("Primeiro fa�a seu cadastro\nDigite seu nome: "),
								   Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo")));
		Endereco enden = new Endereco(JOptionPane.showInputDialog("Digite o logradouro:"),
									  JOptionPane.showInputDialog("Informe a cidade: "), 
									  JOptionPane.showInputDialog("Digite o Estado: "));
		
		pessoa.setEndereco(enden);
		
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado!");
		pd.add(new Produto(1, "     MOTO      :      $4,000 "));
		pd.add(new Produto(2, "    CARRO     :      $25,000"));
		
		
		JOptionPane.showMessageDialog(null, "Clique no Bot�o e vamos as compras");
		int op = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA O PROTUDO DESEJADO: \n "+pd.get(0)+" "+pd.get(1)));
		
		
		
			if(op == 1) {
				JOptionPane.showMessageDialog(null, "O produto selecionado foi: \n"+pd.get(0)+
						"\n Nome: "+pessoa.getNome()+
						"\n Logradouro: "+pessoa.getEndereco().getLogradouro()+
						"\n Numero: "+pessoa.getNumero()+
						"\n Cidade: "+pessoa.getEndereco().getCidade()+
						"\n Estado: "+pessoa.getEndereco().getEstado());
			
			} else if(op == 2) {
				JOptionPane.showMessageDialog(null, "O produto selecionado foi: \n"+pd.get(1)+
						"\n Dados do Solicitante: "+
						"\n Nome: "+pessoa.getNome()+
						"\n Logradouro: "+pessoa.getEndereco().getLogradouro()+
						"\n Numero: "+pessoa.getNumero()+
						"\n Cidade: "+pessoa.getEndereco().getCidade()+
						"\n Estado: "+pessoa.getEndereco().getEstado());
			
			}else{
		
			JOptionPane.showMessageDialog(null, "Est� op��o n�o e Valida");
			}
			Compra compra = new Compra ();
			
			compra.verificaCompra();
	}

}
