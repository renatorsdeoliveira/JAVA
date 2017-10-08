package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int identificacao; 
		double nota1, nota2, nota3, media, mediaExercicio;
		
		identificacao = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero de Identificação: "));
		do{
			nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua NOTA 1: "));
			if(nota1 <0 || nota1>10.0){
				JOptionPane.showMessageDialog(null, "não existe media meno que [0.0] ou maior que [10.0]");
			}else{}
		}while(nota1 <0 || nota1>10.0);
		
		do{
			nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua NOTA 2: "));
			if(nota2 <0 || nota2>10.0){
				JOptionPane.showMessageDialog(null, "não existe media meno que [0.0] ou maior que [10.0]");
			}else{}
		}while(nota2 <0 || nota2>10.0);
		
		do{
			nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua NOTA 3: "));
			if(nota3 <0 || nota3>10.0){
				JOptionPane.showMessageDialog(null, "não existe media meno que [0.0] ou maior que [10.0]");
			}else{}
		}while(nota3 <0 || nota3>10.0);
		
		do{
			mediaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Media dos Exercicios: "));
			if(mediaExercicio <0 || mediaExercicio>10.0){
				JOptionPane.showMessageDialog(null, "não existe media meno que [0.0] ou maior que [10.0]");
			}else{}
		}while(mediaExercicio <0 || mediaExercicio >10.0);
		
		
		
		
		
		media = ((nota1 + nota2 * 2) + nota3 + mediaExercicio / 7);
		
		
		
		
		
		if (media >= 9.0 ){
			 JOptionPane.showMessageDialog(null, identificacao+" Conceito [A] Aprovado!");
		}else if (media >= 7.5){
			JOptionPane.showMessageDialog(null, identificacao+" Conceito [B] Aprovado!");
		}else if (media >= 6.0 ){
			JOptionPane.showMessageDialog(null, identificacao+"Conceito [C] Aprovado!");
		}else if (media >= 4.0 ){
			JOptionPane.showMessageDialog(null, identificacao+"Conceito [D] Reprovado!");
		}else if (media < 4.0 ){
			JOptionPane.showMessageDialog(null, identificacao+"Conceito [E] Reprovado!");
		}else{
			JOptionPane.showMessageDialog(null, identificacao+"Conceito Não encontrado");
		}
		
		
		}	
	}
		

