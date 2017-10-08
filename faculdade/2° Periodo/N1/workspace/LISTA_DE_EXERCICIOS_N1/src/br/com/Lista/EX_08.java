package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x, y, eq;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de [x]; "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de [y]; "));
		
		eq = 2 * ( Math.sqrt(3 * x + 30) /3) + Math.pow(y - 32, 4);
		
		JOptionPane.showMessageDialog(null, "O valor da equanção é de: "+eq);

	}

}
