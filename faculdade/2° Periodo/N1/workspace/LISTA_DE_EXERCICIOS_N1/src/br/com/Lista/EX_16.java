 /*Faça um programa que receba apenas letras e informe se a letra digitada é uma vogal ou
  *  uma consoante. Assume que o usuário irá digitar apenas letras. 
  */
package br.com.Lista;

import java.util.Scanner;

public class EX_16 {
	
	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner (System.in);
		char entrada;
	
		System.out.println("Digite uma letra: ");
		entrada = in.next().charAt(0);
		
		switch (entrada){
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(entrada+" = É uma vogal.");
			break;
		default:
			System.out.println(entrada+" = É uma Cosoante.");
			
		}
				
	}
	

}
