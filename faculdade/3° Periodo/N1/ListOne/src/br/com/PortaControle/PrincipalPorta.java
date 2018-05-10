package br.com.PortaControle;

import javax.swing.JOptionPane;

import br.com.PortaModelo.Porta;

public class PrincipalPorta {

	public static void main(String[] args) {

		int menuM;
		Porta p1 = new Porta();
		p1.setAberta(" Fechada ");
		p1.setCor(" Branca ");
		p1.setDimensaoX(3.0);
		p1.setDimensaoY(2.0);
		p1.setDimensaoZ(8.0);
		JOptionPane.showMessageDialog(null, p1);
		int n = JOptionPane.showConfirmDialog(null, "DESEJA MODIFICAR SUA PORTA? ");
		if (n != 1) {
			do {

				menuM = menu();
				switch (menuM) {
				case 0:
					JOptionPane.showMessageDialog(null, "Finalizando o programa ...");
					break;
				case 1:
					int o = JOptionPane.showConfirmDialog(null, "Deseja abri sua porta? ");
					if (o != 1) {
						p1.setAberta(" Aberta ");
						metodoabrirpotrta(p1.getAberta());
					} else {
						p1.setAberta(" fechada ");
						metodofechaporta(p1.getAberta());
					}
					break;
				case 2:
					p1.setCor(JOptionPane.showInputDialog("Informe a cor desejada "));
					pintarminhaporta(p1.getCor());
					break;
				case 3:
					p1.setDimensaoX(Double
							.parseDouble(JOptionPane.showInputDialog("Altera altura " + p1.getDimensaoX() + " para")));
					p1.setDimensaoY(Double.parseDouble(
							JOptionPane.showInputDialog("Informe a largura de  " + p1.getDimensaoY() + " para")));
					p1.setDimensaoZ(Double.parseDouble(
							JOptionPane.showInputDialog("Informe a espesura de " + p1.getDimensaoZ() + " para ")));
					metodoalteradimensao(p1.getDimensaoX(), p1.getDimensaoY(), p1.getDimensaoZ());
					break;
				case 4:
					String verifica = " Aberta ";
					verificastatusporta(p1.getAberta(), verifica);
					if (verificastatusporta(p1.getAberta(), verifica) == true)
						JOptionPane.showMessageDialog(null, "Porta aberta");
					else
						JOptionPane.showMessageDialog(null, "Porta fechada");

				}
			} while (menuM != 0);
		} else
			menuM = 0;
		JOptionPane.showMessageDialog(null, "Porta modificada \n" + p1);
	}

	private static boolean verificastatusporta(String aberta, String verifica) {
		if (aberta.equals(verifica))
			return true;
		else
			return false;
	}

	private static void metodoalteradimensao(double dimensaoX, double dimensaoY, double dimensaoZ) {
		JOptionPane.showMessageDialog(null, " Sua porta tem \n" + dimensaoX + " - Metros de comprimentos\n " + dimensaoY
				+ " - Metros de Largura\n" + dimensaoZ + " - Centimetros de espesura ");
	}

	private static void pintarminhaporta(String cor) {
		JOptionPane.showMessageDialog(null, " Cor atual: " + cor );

	}

	private static void metodofechaporta(String aberta) {
		JOptionPane.showMessageDialog(null, "Sua porta está:  " + aberta);
	}

	private static void metodoabrirpotrta(String aberta) {
		JOptionPane.showMessageDialog(null, "Porta foi " + aberta);

	}

	private static int menu() {
		String msg = " --- ESCOLHA UMA MODIFICAÇÃO ---\n" + 
						"\n0 - Sair do programa "+
						"\n1 - Abrir ou manter a porta fechada " + 
						"\n2 - Mudar a cor da porta"+
						"\n3 - Altere a diensão da porta " + 
						"\n4 - verificar se a porta está aberta ou fechada\n\n ";
		int opc = Integer.parseInt(JOptionPane.showInputDialog(msg));

		return opc;

	}

}
