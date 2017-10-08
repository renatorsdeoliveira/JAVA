package br.com.Lista;

import java.util.Scanner;

public class EX_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("informe o numero de linhas desejado: ");
		int num1 = leitura.nextInt();
		int i = 0,j = 0;
		for(i = 0; i <= num1;i++){
			System.out.print("\n");
			for(j = 0;j < i;j++){
				System.out.print("* ");
			}
		}
		for(i = num1;i>=0;i--){
			System.out.print("\n");
			for(j = i;j>=0;j--){
				System.out.print("* ");
			}
		}
	}
}