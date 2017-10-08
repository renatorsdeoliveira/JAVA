package br.com.area;

	import java.util.Scanner;

public class Transicao {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	      int[] x = new int[5];
	      int[] J = new int[5];
	      int i , j = 0;
	         for(i = 0 ; i < x.length;i++){
	        	 for(j = 0 ; j <= x.length;j++){
	        		   do{
	               	     System.out.print("Insira o "+(i+1)+ " - numero : ");
	            	     x[i] = in.nextInt();
	        		   }while(x[j] == x[i]);
	        	 }
	         }

		
		
		
		
	}
	
}
