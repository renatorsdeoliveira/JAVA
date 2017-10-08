package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valorCompra, desconto = 0 ;
		
		valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda"));
		
		if(valorCompra < 10){
			
			desconto =  valorCompra * 0.7;
			
		}else if (valorCompra <= 30){
			
			desconto =  valorCompra * 0.5;
			
		}else if (valorCompra <= 50){
			
			desconto = valorCompra * 0.4;
			
		}else if (valorCompra >= 50){
			
			desconto = valorCompra * 0.3;
			
		}else{
			JOptionPane.showMessageDialog(null, "Nenhum numero encontrado!");
		}
		
		
		JOptionPane.showMessageDialog(null, desconto);
	} 

}
