package br.com.Ex_04;

import java.util.Scanner;

public class PrincipalQuadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double lado, area;
		
		System.out.println("Informe o lado do Quadrado: ");
		lado = in.nextDouble();
		System.out.println("Informe a area do quadrado: ");
		area = in.nextDouble();
		
		Quadrado q1 = new Quadrado(lado, area);
		
		System.out.println("tamanho do Quadrado: "+q1.perimetro(lado));
		
	}

}
