package br.com.ex_01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		
		ArrayList<Aluno> listaAlunos = new ArrayList<>();
		
		do {
			Aluno aluno = new Aluno();
						
			aluno.setNome(JOptionPane.showInputDialog("Digite seu nome"));
			aluno.setNumMatricula(JOptionPane.showInputDialog("Digite sua matricula"));	
			
			//verificação da entrada das notas
			do {
				aluno.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota da N1")));
				if(aluno.getN1() < 0 || aluno.getN1() > 10) 
				JOptionPane.showMessageDialog(null, "Nota Invalida, digite entre 0 e 10!");
			} while (aluno.getN1() < 0 || aluno.getN1() > 10);
			do {	
				aluno.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota da N2")));
				if(aluno.getN1() < 0 || aluno.getN1() > 10)
				JOptionPane.showMessageDialog(null, "Nota Invalida, digite entre 0 e 10!");
			} while (aluno.getN2() < 0 || aluno.getN2() > 10);
			
			
			//verificação da situaçao
			if(aluno.calculaMedia() < 6.0) {
				aluno.setSituacao("Reprovado");
			}else {
				aluno.setSituacao("Aprovado");
			}
			
			listaAlunos.add(aluno);
			menu = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e 1 para contuniar"));
		
			if(menu == 0) {
				JOptionPane.showMessageDialog(null, "Saindo do programa!");
			}
	
		} while (menu != 0);
		
		
	
	 	String msg = "";
	    for (int i=0; i<listaAlunos.size(); i++) {
	    	
	      msg += listaAlunos.get(i);
	    }
	    JOptionPane.showMessageDialog(null, msg);

	
	}

}
