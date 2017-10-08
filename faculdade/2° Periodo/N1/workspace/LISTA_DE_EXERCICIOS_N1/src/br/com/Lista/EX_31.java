package br.com.Lista;

import javax.swing.JOptionPane;


public class EX_31 {

	 public static void main(String[] args) {
		    double[] numeros = new double[10];
		    double Maior = 0.0;double Menor = 0.0;double cont = 0.0;
		    do
		    {
		      for (int i = 0; i < numeros.length; i++) {
		        numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		        cont += 1.0D;
		        if (numeros[i] >= Maior) {
		          Maior = numeros[i];
		        }
		        else {
		          Menor = numeros[i];
		        }
		      }
		    } while (
		      cont <= numeros.length);
		    JOptionPane.showMessageDialog(null, 
		      "O maior Numero do vetor  " + Maior + "\n" + "O menor número do vetor  " + Menor);
		  }
	 
}
