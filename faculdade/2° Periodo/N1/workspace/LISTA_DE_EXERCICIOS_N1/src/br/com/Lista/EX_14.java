package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Matricula_do_funcionario,Qtde_horas_extras,continuar;
		double salario_minimo = 788.00,salario_horas_extras,valor_horas_extras = 10.00,salario_bruto,desconto_inss = 0,desconto_do_imposto_de_renda=0;
		
		do{
			Matricula_do_funcionario = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a Matrícula do Funcionario: "));
			Qtde_horas_extras = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a Quantidade de Horas extras Trabalhadas: "));
			
			salario_horas_extras = Qtde_horas_extras * valor_horas_extras;
			salario_bruto = 3 *salario_minimo + salario_horas_extras;
			if(salario_bruto > 1500 && salario_bruto <2000)
				{
					desconto_inss = salario_bruto * 12/100;
				}
			else if(salario_bruto > 2000)
				{
					desconto_do_imposto_de_renda = salario_bruto * 20/100;
				}
			
			
			JOptionPane.showMessageDialog(null,"Funcionário: "+Matricula_do_funcionario+"\nSalário Hora-extra: "+salario_horas_extras+"\nSalário Bruto: "+salario_bruto+"\nDesconto INSS: "+desconto_inss+"\nDesconto do Imposto de Renda: "+desconto_do_imposto_de_renda);
			
			
			
			
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar==0);
		
		
		
	
	
	}

}
