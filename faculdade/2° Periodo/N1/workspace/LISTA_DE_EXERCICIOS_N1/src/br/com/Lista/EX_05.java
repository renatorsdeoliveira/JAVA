package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tempoGastoViagem, velocidadeMedia, distancia, litrosUsados;
		
		tempoGastoViagem = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tempo gasto na Viagem: "));
		velocidadeMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a velcidade Media: "));
		
		distancia = tempoGastoViagem * velocidadeMedia;
		  litrosUsados = (distancia / 12);
		  
		  JOptionPane.showMessageDialog(null, "A velocidade media foi: "+velocidadeMedia+
				  "\nO tempo gasto na viagem foi de: "+tempoGastoViagem+"\nA distancia percorida foi de: "
				  +distancia+"\nA quantidade de litros gastos na viagem foi de: "+litrosUsados);
	}
	

}
