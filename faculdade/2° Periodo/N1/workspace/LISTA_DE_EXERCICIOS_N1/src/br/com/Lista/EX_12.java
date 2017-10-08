/* Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor é facultativo 
 * (entre 16 e 17 anos) ou obrigatório (entre 18 a 65) ou dispensado (acima de 65). */

package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_12 {
	
	public static void main(String[] args) {	
	
	int idade;
	
	idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Iforme sua idade para saber se o seu voto e obrigatorio: "));
	
	if(idade <= 17){
		JOptionPane.showMessageDialog(null, "Seu voto não é obrigatorio!");
	}else if (idade <=65){
		JOptionPane.showMessageDialog(null, "Seu Voto é obrigatorio!");
	}else {
		JOptionPane.showMessageDialog(null, "Não e Obrigatorio seu voto!");
	}
	
}

}
