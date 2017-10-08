package br.com.Lista;
	
import java.util.Scanner;

public class EX_17 {

	

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		int codigo;
		
		System.out.print("Digite o Codigo de [1] a [15]: ");
		codigo = in.nextInt();
		
		if(codigo == 1){
			System.out.println("Alimento não-perecivel");
		}else if(codigo == 2 || codigo == 2 || codigo == 3){
			System.out.println("Alimento perecivel");
		}else if(codigo == 5 || codigo == 6){
			System.out.println("Vestuario");
		}else if(codigo == 7 || codigo == 8 || codigo == 9 || codigo == 10 || codigo == 11 
				|| codigo == 12 || codigo == 13 || codigo == 14 || codigo == 15){
			System.out.println("Limpeza e utensilios domesticos");
		}else{
			System.out.println("Numero invalido");
		}

		
	}
}
