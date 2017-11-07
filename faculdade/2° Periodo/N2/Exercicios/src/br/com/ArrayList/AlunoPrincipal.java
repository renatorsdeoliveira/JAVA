package br.com.ArrayList;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AlunoPrincipal {

	public static void main(String[] args) {


		ArrayList <Aluno> alunos = new ArrayList <Aluno>();
		
		int opc;
		do{

			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe sua matricula: "));
			
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe N1: "));
			while(n1 < 0 || n1 > 10)
			{
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N1 novamente: "));
			}
			

			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe N2: "));
			while(n2 < 0 || n2 > 10)
			{
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N2 novamente: "));
			}
			
			Aluno a = new Aluno(nome, matricula, n1, n2);
			
			alunos.add(a);
			
			opc = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			if (opc != 0 && alunos.size() < 3){
				JOptionPane.showMessageDialog(null, "Informe ao menos 3 alunos.");
			}
			
		}while( opc == 0 || alunos.size() < 3);
		
		for(Aluno al : alunos)
		{
			String msg = "----------------------------- \n";
			double media = (al.getN1() + al.getN2()) / 2;
			
			if(media >= 6)
			{
				msg += al + "\nSituação: APROVADO \n\n";
			}
			else
			{
				msg += al + "\nSituação: REPROVADO \n\n";
			}
			
			JOptionPane.showMessageDialog(null, msg);
		}
		

	}

}

