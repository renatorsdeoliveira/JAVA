package br.com.area;

import javax.swing.JOptionPane;

public class Media_classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, media;
		 int faltas;
		 
	     nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da N1: "));
	     nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da N2: "));
	     faltas = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o numero de FALTAS: "));
	     media = (nota1 +nota2) / 2;
	     
	     String mensagem ="Média do aluno: "+media+"\nFaltas: "+faltas;
	    
	    if(media >=9  && faltas <= 12){
	    	
	    	mensagem += "\n A";
	    	
	    }else if (media >=7 && faltas <= 12){
	 	  
	    	mensagem += "\n B";
	    	
	    }else if (media >=6 && faltas <= 12){
	    	mensagem += "\n c";
	    }
	    else if (media <6 && faltas >= 12){
	    	mensagem += "\n P";
	    }
	    
	    char conceito = 0;
	    
	   switch(conceito){
	   case'A':
	   case'B':
	   case'C':
	   case'P':
		   JOptionPane.showConfirmDialog(null, "Aluno Aprovado");
		
	   }
	   
	
	   
	    	JOptionPane.showMessageDialog(null, mensagem);
	    
	}
}
