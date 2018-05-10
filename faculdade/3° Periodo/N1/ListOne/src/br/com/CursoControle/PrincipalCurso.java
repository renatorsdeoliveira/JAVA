package br.com.CursoControle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.CursoModelo.Curso;
import br.com.CursoModelo.CursoDoutorado;
import br.com.CursoModelo.CursoEspecializado;
import br.com.CursoModelo.CursoMestrado;

public class PrincipalCurso {

	public static void main(String[] args) {
		
		
		
		int menuM, menuList, sair;
//		ArrayList<Curso> cursosList = new ArrayList<Curso>();
		
		ArrayList<CursoEspecializado> listaEspecializacao = new ArrayList<CursoEspecializado>();
		ArrayList<CursoMestrado> listaMestrado = new ArrayList<CursoMestrado>();
		ArrayList<CursoDoutorado> listaDoutorado = new ArrayList<CursoDoutorado>();
		
		do{
			
	  //--------------------------------------------------------------//	
	 //------------------ Recolhendo dados --------------------------//
	//--------------------------------------------------------------//
			
			menuM = menu();
			switch (menuM) {
			case 1:
				listaEspecializacao.add(chamaCursoEspecializacao());
				break;
			case 2:
				listaMestrado.add(mostraCursoMestrado());
				break;
			case 3:
				listaDoutorado.add(mostraCursoDoutorado());
				break;
			default:
				break;
			}
			sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
		}while(sair !=0);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		
		
		
	//---------------------------------------------------------------//
	//------------------ mostando os dados --------------------------//
	//---------------------------------------------------------------//
		
		menuList = menuArray();
		switch (menuList) {
		case 1:
			for (CursoEspecializado cursoEspecializacao : listaEspecializacao) {
				JOptionPane.showMessageDialog(null, cursoEspecializacao);
			}
			break;
		case 2:
			for (CursoMestrado cursoMestrado : listaMestrado) {
				JOptionPane.showMessageDialog(null, cursoMestrado);
			}
			break;
		case 3:
			for (CursoDoutorado cursoDoutorado : listaDoutorado) {
				JOptionPane.showMessageDialog(null, cursoDoutorado);
			}
			break;
		default:
			break;
		}

	}
	
	
	
	//----------------------------------------------------//
	//------------------ medotos -------------------------//
	//----------------------------------------------------//
	
	
	private static int menuArray() {
		int menu;
		
			do {
			menu = Integer.parseInt(JOptionPane.showInputDialog( 
					"------- PORTAL DO ALUNO -------\n\n"
					+"Escolha uma opção\n"
					+ "1 - Inforações sobre Especialização \n" 
					+ "2 - Inforações sobre Mestrado\n" 
					+ "3 - Inforações sobre Doutorado\n\n"  
					+ "" ));
			if(menu < 1 || menu > 3){
				JOptionPane.showMessageDialog(null, "Por favor digite um numero de 1 a 3");
			}
			} while (menu < 1 || menu > 3);
			return menu;

	}

	private static int menu() {
		int menu;
		
			do {
			menu = Integer.parseInt(JOptionPane.showInputDialog( 
					"------- INFORMAÇÕES DOS CURSOS -------\n\n"
					+"Escolha uma opção\n"
					+ "1 - Curso Especialização\n" 
					+ "2 - Curso Mestrado\n" 
					+ "3 - Curso Doutorado\n\n"  
					+ "" ));
			if(menu < 1 || menu > 3){
				JOptionPane.showMessageDialog(null, "Por favor digite um numero de 1 a 3");
			}
			} while (menu < 1 || menu > 3);
			return menu;
		
	}

	private static CursoDoutorado mostraCursoDoutorado() {
		CursoDoutorado cd = new CursoDoutorado();
		
		cd.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Curso: ")));
		cd.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
		cd.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
		cd.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do Professor: "));
		cd.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaría do curso: ")));
//		cd.setStrictoSensu(JOptionPane.showInputDialog("Digite se o curso e Sesu s/n: "));
		cd.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
		cd.setQuantiadeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de alunos do curso: ")));	
		cd.setMesesParaDefesa(Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo que falta para defesa: ")));	

		cd.adicional();
		cd.adicionalDiploma();
		JOptionPane.showMessageDialog(null, cd.toString());
		
		return cd;
		
	}

	private static CursoMestrado mostraCursoMestrado() {
		CursoMestrado cm = new CursoMestrado();
		
		cm.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codído do Curso: ")));
		cm.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
		cm.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
		cm.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do Professor: "));
		cm.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaría do curso: ")));
		cm.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
		cm.setQuantiadeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de alunos do curso: ")));	
		cm.adicional();
		JOptionPane.showMessageDialog(null, cm.toString());
		return cm;
		
	}

	private static CursoEspecializado chamaCursoEspecializacao() {
		
		CursoEspecializado ce = new CursoEspecializado();
		
		ce.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codído do Curso: ")));
		ce.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
		ce.setNome(JOptionPane.showInputDialog("Digite seu Nome: "));
		ce.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do Professor: "));
		ce.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaría do curso: ")));
		ce.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
		ce.setQuantiadeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de alunos do curso: ")));	
		ce.adicional();
		JOptionPane.showMessageDialog(null, ce.toString());
		
		return ce;
	}


}
