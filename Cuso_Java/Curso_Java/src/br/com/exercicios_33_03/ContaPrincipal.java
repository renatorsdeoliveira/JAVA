package br.com.exercicios_33_03;

import javax.swing.JOptionPane;

public class ContaPrincipal {

	public static void main(String[] args) {
	
			Conta idades = new Conta();
			
		idades.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Bom dia Jorjão!!!\nDigite sua idade")));
		do{
			 if(idades.< 40 ){
				 JOptionPane.showMessageDialog(null, "Sabemos que essa não e sua idade Veudadeira, por Favor NÃO MINTA: ");
			 }else{
				 JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ ESTÁ VELHO");
			 }
			

			}while(this.getIdade() < 40)
			;
	
	}

}
