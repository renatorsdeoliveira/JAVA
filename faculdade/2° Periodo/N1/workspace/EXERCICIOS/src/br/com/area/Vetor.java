package br.com.area;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Vetor {

	private static Scanner leitura;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] P = new int [10];
		
		tabela();
		
		for(int i = 0; i < P.length; i++)
		{
			P[i] = sorteia(1 , 100);
		}
		
		String msg = "";
		for (int i = 0; i < P.length; i++) {
			if(P[i] >= 25)
			{
				msg += P[i]+ " é maior que 25,  está na posição "+ i+"\n";
			}
		}
		JOptionPane.showMessageDialog(null,msg);
		
		JOptionPane.showMessageDialog(null, soma(2.0, 3.5));
		
		
	}
	
	public static int sorteia(int limiteInferior, int limiteSuperior)
	{
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
	
	
	public static void tabela(){
		JOptionPane.showMessageDialog(null, "... coloque a tabela aqui.");
	}
	
	public static double soma(double n1, double n2)
	{
		return n1 + n2;
	}
	
	public static double potencia(double x, double y)
	{
		double p = 1.0;
		
		for(int i = 1; i <= y; i++)
		{
			p = p * x;
		}
		
		return p;
	}
	
	
}
