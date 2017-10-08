package br.com.area;

import javax.swing.JOptionPane;

public class Media_String {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1, nota2, media;
		
	     nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da N1: "));
	     nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da N2: "));
	    
	     media = (nota1 +nota2) / 2;
	     
	     String mensagem ="Média do aluno: "+media;
	    
	    if(media >=6){
	    	mensagem += "\nO aluno foi Aprovado";
	    }else{
	    	mensagem += "\nO aluno foi Reprovado";
	    }
	    	JOptionPane.showMessageDialog(null, mensagem);
	}

}
