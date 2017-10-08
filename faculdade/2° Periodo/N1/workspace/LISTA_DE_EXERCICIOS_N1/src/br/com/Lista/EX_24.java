package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha, senhaP;
		
		senha = JOptionPane.showInputDialog("Cadastre uma Senha!");
		
		do{
			
		senhaP = JOptionPane.showInputDialog("Informe a senha cadastrada: ");
		if(!senha.equals(senhaP)){
			JOptionPane.showMessageDialog(null,"Senha invalida");
		}else{
			JOptionPane.showMessageDialog(null,"Sej bem Vindo!!!");
			}
		}while(!senha.equals(senhaP));
	}

}
