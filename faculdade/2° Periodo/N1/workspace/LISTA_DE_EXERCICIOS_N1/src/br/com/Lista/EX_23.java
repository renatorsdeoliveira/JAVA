package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_23 {

	private static final Integer Char = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		double N1, N2, media, Validacao;
		
		
		do{	
		nome = JOptionPane.showInputDialog("Digite seu Nome: ");
		do{
		N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite NOTA 1: "));
		if(N1 < 0 || N1 > 10)
			JOptionPane.showMessageDialog(null, "NOTA INVALIDA! Tente novamente!");
		}while(N1 <0 || N1 > 10.0);
		do{
			N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite NOTA 2: "));
			if(N2 < 0 || N2 > 10)
				JOptionPane.showMessageDialog(null, "NOTA INVALIDA! Tente novamente!");
			}while(N1 <0 || N1 > 10.0);
		
		
		media = (N1 + N2) /2;
		JOptionPane.showMessageDialog(null, nome+"\nTIROU MEDIA: "+media);
		
		Validacao = Integer.parseInt(JOptionPane.showInputDialog("Digite [0] para 'sair e [1] para continuar: "));
		if( Validacao !=1 && Validacao != 0)
		JOptionPane.showMessageDialog(null, "DIGITE [0] OU [1];");
			
		
			}while( Validacao != 0);
		
	
		
	}

}
