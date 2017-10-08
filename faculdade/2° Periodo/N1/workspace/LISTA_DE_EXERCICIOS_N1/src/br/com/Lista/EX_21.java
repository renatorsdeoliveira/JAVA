package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int atual =1, fatorial = 1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero: "));
		
		while(atual <= numero){
			
			fatorial = fatorial * atual;
			atual++;			
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de "+numero+" é: "+fatorial);
	}

}
