package br.com.Ex_05;

import java.util.Scanner;

public class PrincipalEstoque {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int qtdAtual, qtdMinima;
		String nome;
		
		System.out.println("Digite o nome do produto: ");
		nome = in.nextLine();
		do{
		System.out.println("Digite a quantidade atual: ");
		qtdAtual = in.nextInt();
		}while(qtdAtual < 0);
		do{
		System.out.println("Digite a quantidade minima: ");
		qtdMinima = in.nextInt();
		}while(qtdAtual < 0);
		
		Estoque q = new Estoque(nome, qtdAtual, qtdMinima);

		System.out.println(q.mostra() );
		System.out.println("Dar baixa em " );
	}

}
