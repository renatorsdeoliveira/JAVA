package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_35 {
	

	  public static void main(String[] args) {
	    int[] vetorA = new int[10];
	    

	    for (int i = 0; i < vetorA.length; i++) {
	      vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valores do vetor A"));
	    }
	    

	    tabela();
	    
	    int escolha = Integer.parseInt(JOptionPane.showInputDialog("O que voce deseja fazer com estes vetores"));
	    switch (escolha) {
	    case 0: 
	      JOptionPane.showMessageDialog(null, "Programa Encerrado");
	      break;
	    case 1: 
	      for (int i = 0; i < vetorA.length; i++) {
	        JOptionPane.showMessageDialog(null, "Vetores " + vetorA[i]);
	      }
	      break;
	    case 2: 
	      for (int i = 0; i > vetorA.length; i--) {
	        JOptionPane.showMessageDialog(null, "Vetores " + vetorA[i]);
	      }
	      break;
	    default: 
	      JOptionPane.showMessageDialog(null, "Codigo Inválido");
	    }
	    
	  }
	  

	  public static void tabela()
	  {
	    JOptionPane.showMessageDialog(null, "0 - Encerrar programa\n1 - Mostrar vetores na ordem direta\n2 - Mostra vetores na ordem inversa");
	  }
	

}
