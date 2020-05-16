package br.com.prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

		//-----------------------------------aluno
	
	
		AlunoMasculino alunoMaculino = new AlunoMasculino();
		Notas notaMasc = new Notas();
		Aluno aluno = new Aluno();
		Notas nota = new Notas();
		
	
		int sexo = Integer.parseInt(JOptionPane.showInputDialog("Qual seu sexo? \n[0] para Feminino \n[1] para Marculino  "));
		if(sexo == 0) aluno.setSexo(true);
		
		if(aluno.isSexo() != true) {
			alunoMaculino.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
			alunoMaculino.setIdentidadeMilitar(JOptionPane.showInputDialog("Digite as sua Identidade Militar"));
			while(alunoMaculino.getIdentidadeMilitar().length() <= 5 ) {	
				alunoMaculino.setIdentidadeMilitar(JOptionPane.showInputDialog("Identidade Militar deve ter no minimo 5 Digitos "));
			}
			alunoMaculino.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu codígo:")));
			alunoMaculino.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
			while(alunoMaculino.getIdade() < 0 || aluno.getIdade() > 120 ) {	
				alunoMaculino.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua identidade: ")));
			}
			alunoMaculino.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço:"));
			alunoMaculino.setCpf(JOptionPane.showInputDialog("Digite seu cpf"));
			while(alunoMaculino.getCpf().length() != 11 ) {	
				alunoMaculino.setCpf(JOptionPane.showInputDialog("CPF deve ter 11 digitos"));
			}
		
			
			notaMasc.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1:")));
			while(notaMasc.getN1() < 0 || notaMasc.getN1() > 10) {	
				notaMasc.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1 entre 0 a 10:")));
			}
			notaMasc.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2:")));
			while(notaMasc.getN2() < 0 || notaMasc.getN2() > 10) {	
				notaMasc.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2 entre 0 a 10:")));
			}
			notaMasc.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3:")));
			while(notaMasc.getN3() < 0 || notaMasc.getN3() > 10) {	
				notaMasc.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3 entre 0 a 10:")));
			}
			
			listaAluno.add(alunoMaculino);
		}
		else {
			
			
			aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
			aluno.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu codígo:")));
			aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
			while(aluno.getIdade() < 0 || aluno.getIdade() > 120 ) {	
				aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sua identidade: ")));
			}
			aluno.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço:"));
			aluno.setCpf(JOptionPane.showInputDialog("Digite o seu cpf:"));
			while(aluno.getCpf().length() != 11) {	
				aluno.setCpf(JOptionPane.showInputDialog("CPF deve ter 11 digitos"));
			}
			
			
			nota.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1:")));
			while(nota.getN1() < 0 || nota.getN1() > 10) {	
				nota.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1 entre 0 a 10:")));
			}
			nota.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2:")));
			while(nota.getN2() < 0 || nota.getN2() > 10) {	
				nota.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2 entre 0 a 10:")));
			}
			nota.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3:")));
			while(nota.getN3() < 0 || nota.getN3() > 10) {	
				nota.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3 entre 0 a 10:")));
			}
			nota.setMedia(nota.getN1(), nota.getN2(), nota.getN3());
			aluno.setNotas(nota);
			
			listaAluno.add(aluno);
		}


		
	
		String saidaAlunoMas ="";
		saidaAlunoMas += aluno.toString();
		saidaAlunoMas += nota.toString();
		JOptionPane.showMessageDialog(null, saidaAlunoMas );
	
		//-----------------------------------aluno
		
		//-----------------------------------aluno
		


		
		
		
		

	}
	


}
