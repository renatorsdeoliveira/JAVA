package br.com.area;

import javax.swing.JOptionPane;

public class Senha {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String senha, senhaP = "a2d3r4r4";
			
			do{
				senha = JOptionPane.showInputDialog("Informe sua Senha");
				if(!senha.equals(senhaP)){
					JOptionPane.showMessageDialog(null, "Senha Invalida!");
				}else{
					JOptionPane.showMessageDialog(null, "Bem vindo!");
				}
				
			}while(!senha.equals(senhaP));
		}

}
