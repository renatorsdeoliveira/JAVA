package br.com.introducao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);

		int inicio, fim, divisor, cont;

		do {
			System.out.println("Informe o inicio do intervalo: ");
			inicio = leitura.nextInt();

			System.out.println("Informe o fim do intervalo: ");
			fim = leitura.nextInt();
			if (inicio > fim)
				System.out.println("O fim deve ser maior que o inicio.");
		} while (inicio > fim);
		
		System.out.println("Informe o divisor: ");
		divisor = leitura.nextInt();
		
		
		System.out.println("Divisores: ");
		System.out.println("while......");
		cont = inicio;
		while(cont <= fim){
			if(cont % divisor == 0){
				System.out.println(cont);
			}
			cont++ ;
		}
		System.out.println("for.......");
		for(cont = inicio; cont <= fim; cont++){
			if(cont % divisor == 0){
				System.out.println(cont);
			}
		}

	}

}
