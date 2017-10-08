package br.com.Lista;

import java.util.Scanner;

public class EX_10 {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		
		System.out.println("  Digite 0 para sair!  ");
		
		System.out.println(" NUMERO  \t\t  TYPO  ");
		System.out.println("  01     \t\t  LCD  ");
		System.out.println("  02     \t\t  LED  ");
		System.out.println("  03     \t\t  PLAsMA  ");

		int salariofixo = 1874;
		int comissao, tvs, qtd, calculo;
		int  lcd = 0, led= 0, plasma = 0;
		int tvLcd = (int)50.00, tvLed =  (int)60.00, tvPlasma =  (int)75.00;
		
		
	
		System.out.println("Digite o numero do Televisor vendido: ");
		tvs = in.nextInt();
		System.out.println("Digite a quantidade do Televisor vendido: ");
		qtd = in.nextInt();
		
		
		if(tvs == 1){
			lcd = tvLcd * qtd;
			
		}else if(tvs == 2){
			
			led = tvLed * qtd;
			
		}else if(tvs == 3){
			plasma = tvPlasma * qtd;
		}else{
		  System.out.println("Saindo do Programa!...");
		}
		
		comissao = lcd + led + plasma;
		calculo = comissao + salariofixo;
		
		System.out.println("Seu Salario é: "+calculo);
	}
}
