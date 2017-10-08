package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1, x2, y1, y2, distancia;
		

		
		x1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a cordenada [x] A: "));
		y1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a cordenada [y] A: "));
		x2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a cordenada [x] B: "));
		y2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a cordenada [y] B: "));
		
		distancia = Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));
		
		JOptionPane.showMessageDialog(null, "A distancia Elclidiana é: "+distancia);


	}

}
