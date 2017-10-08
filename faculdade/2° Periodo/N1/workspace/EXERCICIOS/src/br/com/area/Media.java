package br.com.area;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		double nota1, nota2, media;
		
	     nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da N1: "));
	     nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da N2: "));
	    
	     media = (nota1 +nota2) / 2;
	     
	    JOptionPane.showMessageDialog(null, "A media do aluno foi: "+media);
	    
	    if(media >=6){
	    	JOptionPane.showMessageDialog(null, "Aluno Aprovado");
	    }else{
	    	JOptionPane.showMessageDialog(null, "Aluno Reprovado");
	    }
	}
}
