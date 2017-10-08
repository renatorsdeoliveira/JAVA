package br.com.area;

import javax.swing.JOptionPane;

public class OpcoesdeNomes {
	
	public static void main(String[]arg) {
		
	String titulo = "POO";	
			Object[] lista = {"Paulo", "Luiz", "meire"};
			
			String opcaoSelecionada = (String)			
			JOptionPane.showInputDialog(null, "Selecione o seu nome: ", titulo, 3, null, lista, null);	
			JOptionPane.showMessageDialog(null, "Seu nome é: "+opcaoSelecionada);
	}

}
