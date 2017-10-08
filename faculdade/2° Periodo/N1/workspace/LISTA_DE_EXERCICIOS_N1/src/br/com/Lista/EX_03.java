package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			final double pi = 3.14159;
			double raio,area, perimetro, calculo;
			
			raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da esfera	: "));
			
			area = pi*Math.pow(raio, 2);
			perimetro = 2*pi*raio;
			
			calculo = area * perimetro;
			
			JOptionPane.showMessageDialog(null, "O valor do Calcúlo é: "+calculo);
			
	}

}
