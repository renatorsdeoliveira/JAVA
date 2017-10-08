/*Escreva um programa que receba um número inteiro de 3 dígitos e imprima o dígito 
 * das Centenas, o dígito das Dezenas e o dígito das Unidades. Em seguida, o programa 
 * deverá inverter o número recebido, isto é, se o usuário digitou 123, seu programa 
 * deverá gerar o número 321. */

package br.com.Lista;

	import javax.swing.JOptionPane;

public class EX_07 {
	
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
