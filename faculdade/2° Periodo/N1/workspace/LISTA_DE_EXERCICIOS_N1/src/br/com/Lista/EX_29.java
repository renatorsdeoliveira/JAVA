package br.com.Lista;

import java.util.Scanner;

public class EX_29 {

	public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in);
		 
	        int quantLinhas,linha=1,coluna;
	        String saida;
	        
	        System.out.println("Digite a Qauntidade de Linhas: ");
	        quantLinhas = in.nextInt();
	        
	        
	        while(linha <= quantLinhas){
	            coluna=1;
	            while(coluna <= linha){
	                System.out.print("*");
	                coluna++;
	            }
	            System.out.print("\n");
	            linha++;
	        }
	        
	        
	        
	 }
}

