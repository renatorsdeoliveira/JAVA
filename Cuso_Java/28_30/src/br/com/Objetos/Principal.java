package br.com.Objetos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Lampada o1 = new Lampada ();
		
		System.out.print("Digite a cor da Lampada: ");
		String cor = in.nextLine();

		System.out.print("Digite o Valor da Lampada: ");
		double valor = in.nextDouble();

		System.out.print("Digite a Voltagem da Lampada: ");
		int wolts = in.nextInt();

		System.out.print("Digite quanto tempo de garantia: ");
		int garantia = in.nextInt();
		
		System.out.println("\n--------------------------- LAMPADA -----------------------------------------");
		System.out.println("\nA Lampada e da cor "+o1.getCor(cor)+" do valor de "+o1.getValor(valor)+" com a voltagem de "+o1.getWolts(valor)+" com a garantide "+o1.getGarantia(garantia));
		

	}

}