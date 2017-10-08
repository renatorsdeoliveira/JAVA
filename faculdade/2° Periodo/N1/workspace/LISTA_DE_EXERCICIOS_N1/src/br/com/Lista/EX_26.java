package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo=0,saque,deposito;
		int continuar;
		String op;
		do{
		op = JOptionPane.showInputDialog("informe a opção desejada!\n(a)Consulta de saldo\n(b)Saque\n(c)Depósito");
		switch (op) {
		case "a":
		case "A":
			JOptionPane.showMessageDialog(null, "Saldo R$"+saldo);
			break;
		case "b":
		case "B":
			saque = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do saque R$: "));
			saldo = saldo - saque;
			break;
		case "c":
		case "C":
			deposito = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito R$: "));
			saldo += deposito;
			break;

		default:
			break;
		}
		
		
		continuar =JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");
		}while(continuar == 0);
			
	}

}
