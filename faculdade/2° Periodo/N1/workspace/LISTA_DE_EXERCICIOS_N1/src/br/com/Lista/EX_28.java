package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, 
				         "  \t\tDigite 0 para sair!  "
				
				+ "\n CODIGO   \t    Valor   \t   PRODUTO "
				+ "\n   1      \t\t   R$ 1.50  \t\t  Cachorro quente"
				+ "\n   2      \t\t   R$ 2.00  \t\t  Hamburger "
				+ "\n   3      \t\t   R$ 2.50  \t\t  Cheeseburger "
				+ "\n   4      \t\t   R$ 3.00  \t\t  EggCheeseburger "
				+ "\n   5      \t\t   R$ 1.50  \t\t  Refrigerante  ");
		
		double codigo, quantidade, saida, cal=0;
		
		do{
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codio o Produto : "));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada: "));
		
		if(codigo == 1){
			cal = cal + (quantidade * 1.50);
			
		}else if(codigo == 2){
			cal = cal + (quantidade * 2.00);
			cal++;
		}else if(codigo == 3){
			cal = cal + (quantidade * 2.50);
			
		}else if(codigo == 4){
			cal = cal + (quantidade * 3.00);
			
		}else if(codigo == 5){
			cal = cal + (quantidade * 1.50);
			
		}else{
			JOptionPane.showMessageDialog(null, "Produto Não Encontrado");
		}

		saida = Integer.parseInt(JOptionPane.showInputDialog("Digite [0] para 'sair e [1] para continuar: "));
		if( saida !=1 && saida != 0)
		JOptionPane.showMessageDialog(null, "DIGITE [0] OU [1];");
		}while(saida != 0);
		
		JOptionPane.showMessageDialog(null, "O valor da sua conta foi: "+cal);
	}

}
