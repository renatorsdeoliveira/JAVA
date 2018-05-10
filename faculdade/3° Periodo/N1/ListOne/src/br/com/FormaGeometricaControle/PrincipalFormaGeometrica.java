package br.com.FormaGeometricaControle;

import javax.swing.JOptionPane;


import br.com.FormaGeometricaModelo.Circulo;
import br.com.FormaGeometricaModelo.FiguraGeometrica;
import br.com.FormaGeometricaModelo.Quadrado;
import br.com.FormaGeometricaModelo.Retangulo;

public class PrincipalFormaGeometrica {

	public static void main(String[] args) {

		int menuM, sair;
		

		do{
						
			menuM = menu();
			switch (menuM) {
			case 1:
				Quadrado cd = new Quadrado();
				cd.setLado(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Quadrado: ")));
				JOptionPane.showMessageDialog(null, cd.exibirDados());
				break;
			case 2:
				Circulo cr = new Circulo();
				cr.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o o raio do circulo: ")));
				JOptionPane.showMessageDialog(null, cr.exibirDados());
				break;
			case 3:
				Retangulo rt = new Retangulo();
				rt.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retangulo: "))); 
				rt.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retangulo: ")));
				JOptionPane.showMessageDialog(null, rt.exibirDados());
				break;
			default:
				break;
			}
			sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
		}while(sair !=0);			

	}

private static int menu() {
	int menu;
	
		do {
		menu = Integer.parseInt(JOptionPane.showInputDialog( 
				"------- ESCOLHA UM OPÇÃO -------\n\n"
				
				+ "1 - Quadrado\n" 
				+ "2 - Círculo\n" 
				+ "3 - Retângulo\n\n"  
				+ "" ));
		if(menu < 1 || menu > 3){
			JOptionPane.showMessageDialog(null, "Por favor digite um numero de 1 a 3");
		}
		} while (menu < 1 || menu > 3);
		return menu;
	
}
}
