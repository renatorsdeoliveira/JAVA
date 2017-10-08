package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_34 {

	  
	  public static void main(String[] args) {
	    int[] vetorA = new int[10];
	    int[] vetorB = new int[5];
	    
	    for (int i = 0; i < vetorA.length; i++) {
	      vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valores do vetor A"));
	    }
	    

	    for (int i = 0; i < vetorB.length; i++) {
	      vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valores do vetor B"));
	    }
	    

	    for (int i = 0; i < vetorA.length; i++) {
	      JOptionPane.showMessageDialog(null, "Valores do vetor A" + vetorA[i] + " na import javax.swing.JOptionPane;" + i);
	      for (int j = 0; j < vetorB.length; j++) {
	        JOptionPane.showMessageDialog(null, 
	          "Numero " + vetorA[i] + " divisivel por " + vetorB[i] + " na posição" + i);
	      }
	    }
	 }
}
