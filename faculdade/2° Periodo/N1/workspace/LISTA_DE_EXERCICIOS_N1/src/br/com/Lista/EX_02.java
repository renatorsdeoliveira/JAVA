/* um programa que leia 2 números inteiros A e B. Em seguida realize a troca dos números, 
onde o valor da variável B seja colocado em A e vice-versa. Apresente os valores trocados.*/ 

package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_02 {
	
	public static void main(String[] args) {	
		
		int A, B, aux;
		
		A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Numero A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Numero B: "));
		
		aux = A;
		A = B;
		B = aux;
		
		JOptionPane.showMessageDialog(null, "A = "+A+" "+"B = "+B,"Numero após a troca", 3);
		
	}

}
