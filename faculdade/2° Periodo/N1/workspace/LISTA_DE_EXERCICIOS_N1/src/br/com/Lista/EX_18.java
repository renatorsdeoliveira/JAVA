package br.com.Lista;

import java.util.Scanner;

public class EX_18 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		in = new Scanner (System.in);
		
		int codigo;
		double salario, salarioFinal; 
		
		System.out.println("  Digite 0 para sair!  ");
		
		System.out.println(" CODIGO  \t\t  CARGO  ");
		System.out.println("  1      \t\t  Escritorio  ");
		System.out.println("  2      \t\t  Secretario  ");
		System.out.println("  3      \t\t  Caixa  ");
		System.out.println("  4      \t\t  Caixa  ");
		System.out.println("  5      \t\t  Caixa  ");
		
		System.out.print("Digite seu salário: ");
		salario = in.nextDouble();
		do{
			System.out.print("Digite o Codigo: ");
			codigo = in.nextInt();
		if(codigo<=0 || codigo >=6){
			System.out.print("Codigo invalido digite de 1 a 5: ");
		}
		}while(codigo<=0 || codigo >=6);
		
		if(codigo ==1){
			salarioFinal = salario + (salario * 0.50);
			System.out.println("Salário Final: "+salarioFinal);
		} else if(codigo ==2){
			salarioFinal = salario + (salario * 0.35);
			System.out.println("Salário Final: "+salarioFinal);
		}else if(codigo ==3){
			salarioFinal = salario + (salario * 0.20);
			System.out.println("Salário Final: "+salarioFinal);
		}else if(codigo ==4){
			salarioFinal = salario + (salario * 0.10);
			System.out.println("Salário Final: "+salarioFinal);
		}else if(codigo ==5){
			System.out.println("Salário Final: "+salario);
		}else{
			System.out.println("Codíco não encontrado");
		}
		

	}


	

}
