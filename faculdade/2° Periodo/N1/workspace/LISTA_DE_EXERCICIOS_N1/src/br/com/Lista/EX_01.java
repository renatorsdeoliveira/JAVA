/*1. Faça um programa que leia o nome e sobrenome de duas pessoas (marido e esposa) 
 * e um ano (inteiro). E exiba a seguinte mensagem: “Fulano da Silva é casado 
 * com Ciclana de Souza há XX anos”. Considere o ano atual como 2017 */

package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomeMarido, nomeEsposa, sobreMarido, sobreEsposa;
		int anoCasamento, anoAtual;
		
		nomeMarido = JOptionPane.showInputDialog(null, "Digite o nome do Marido");
		sobreMarido = JOptionPane.showInputDialog(null, "Digite o Sobrenome do Marido");
		nomeEsposa = JOptionPane.showInputDialog(null, "Digite o nome da Esposa");
		sobreEsposa = JOptionPane.showInputDialog(null, "Digite o Sobrenome da Esposa");
		anoCasamento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano do Casamento"));
		
		anoAtual = 2017 - anoCasamento;
		String messagemMarido = " "+nomeMarido+" "+sobreEsposa;
		String messagemMulher = " "+nomeEsposa+" "+sobreMarido;
		
		JOptionPane.showMessageDialog(null, "O Nome do Marido é: "+messagemMarido+
				"\n O nome da Esposa é: "+messagemMulher+"\n Casados há: "+anoAtual);

	}


}
