package br.com.jorge;

import javax.swing.JOptionPane;

public class Anoversario {

	public static void main(String[] args) {
		
		int idade;
	
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "\t\t\tBom dia Jorjão!!!\n\t\t\tDigite sua idade"));
		
		
			 if(idade < 40 ){
				
					 do{
					 idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Sabemos que essa não e sua idade Veudadeira, por Favor \nNÃO MINTA: "));
				 
					 }while(idade < 40);
			 }else   {
				 JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ ESTÁ VELHO");
			 }
			
			 JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ ESTÁ VELHO");
			
		}

}
