package br.com.area;

import javax.swing.JOptionPane;

public class RetornoMessagem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, cont=0;
		do{
			
		
		opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "POO", 1, 3);
		cont++;
		}while(opcao == 0);
		
		JOptionPane.showMessageDialog(null, "Continou: "+cont+" Vezes");
	}

}
