/* Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto variável
 *  em % informado pelo vendedor. Escreva um programa que leia o valor original do produto e
 *   o valor do desconto oferecido pelo vendedor e imprima o novo valor do produto. 
 */
package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_04 {
	
	public static void main(String[] args) {
		
	double venda, porcentagem, resultado;
	
	venda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite valor da venda: "));
	
	porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos porcentos de desconto: "));

	resultado = venda - ( venda *(porcentagem / 100));
	
	JOptionPane.showMessageDialog(null, "O Valor da da veda com desconto é: "+resultado);
	
	
	}
}
