package br.com.PortaControle;

import javax.swing.JOptionPane;

import br.com.PortaModelo.Porta;

public class PortaTeste {

	public static void main(String[] args) {
		
		Porta porta = new Porta();
		
		int sair, op;
		
		do{
			op = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um numero\n" + "1 - para Criar uma porta\n" + "2 - Pinte sua porta\n"
							+ "3 - Almente a Dimenção y da porta\n" + "4 - Almente a Dimensão z da porta\n"));

			switch (op) {
			case 1:
				
				break;

			default:
				break;
			}

			sair = JOptionPane.showConfirmDialog(null, "Deseja sair? ");
		} while (sair != 0);
	}

}
