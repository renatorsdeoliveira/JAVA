package br.com.prova;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

		//-----------------------------------aluno
	
	
		AlunoMasculino alunoMaculino = new AlunoMasculino();
		Aluno aluno = new Aluno();
		Aluno alunoEspecializacao = new Aluno();
		Aluno alunoMestado = new Aluno();
		
		
		
	     // menu principal ----------------------------------------
		 JOptionPane.showMessageDialog(null, "Escolha uma opção para continuar: ");
		 int menuPrincipal  = Integer.parseInt(JOptionPane.showInputDialog(""
			+ "[1] Cadastrar um Aluno"
			+ "\n[2] Cadastrar um Curso"
			+ "\n[3] Cadastrar um Especialização"
			+ "\n[4] Cadastrar um Curso Mestrado"
			+ "\n[5] Pegar diploma Mestrado"
			+ "\n[6] Pegar diploma Especializacao"
	

		 ));
		// menu principal ----------------------------------------
		
		
		if(menuPrincipal == 1){
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
				
					Notas notaMasc = new Notas();
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
					notaMasc.setMedia(notaMasc.getN1(), notaMasc.getN2(), notaMasc.getN3());
					alunoMaculino.setNotas(notaMasc);
					listaAluno.add(alunoMaculino);
					

					JOptionPane.showMessageDialog(null, alunoMaculino.toString());
				
			}
			else {
				
				
				aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
				aluno.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu codígo:")));
				aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
				while(aluno.getIdade() < 0 || aluno.getIdade() > 120 ) {	
					aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idetidade invalida digite ente 0 a 120: ")));
				}
				aluno.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço:"));
				aluno.setCpf(JOptionPane.showInputDialog("Digite o seu cpf:"));
				while(aluno.getCpf().length() != 11) {	
					aluno.setCpf(JOptionPane.showInputDialog("CPF deve ter 11 digitos"));
				}
				
				Notas nota = new Notas();
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
				JOptionPane.showMessageDialog(null, aluno.toString());	
				
			}
		}else if(menuPrincipal == 2){
			
			// curos -----------------------------------------

			int menuCursosOp =  Integer.parseInt(JOptionPane.showInputDialog(
								"Crie ou escolha um curso"
							   + "\n[1] Cadastro \n[2] Escolher existente\n"));
			ArrayList<Curso> listaCurso = new ArrayList<Curso>();
			switch (menuCursosOp) {
				case 1:
					int opsAddCsMestrado;
					String msgCursoMestrado = "";
			  do {
					Curso curso = new Curso();
					curso.setNomeCurso(JOptionPane.showInputDialog("Digite o nome do curso: "));
					curso.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do curso: ")));
					curso.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do professor: "));
					curso.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga Horaria: ")));
					while(curso.getCargaHoraria() <= 0) {
						curso.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("A carga horaria não pode ser 0: ")));
					}
					curso.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
					while(curso.getValorCurso()  <= 0) {
						curso.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("O valor do Curso não pode ser zero: ")));
					}
					curso.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
					
					listaCurso.add(curso);
					opsAddCsMestrado = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um Curso de mestrado?"
																					+ "\n[0] Sim"
																					+ "\n[1] Não"));
				} while (opsAddCsMestrado == 0);
			  
				for (Curso saidaCuspMestrado : listaCurso) {
					msgCursoMestrado += saidaCuspMestrado.toString();
				}
				
				JOptionPane.showMessageDialog(null,  msgCursoMestrado);
				
				break;
					
				case 2:
					Curso curso = new Curso();
					Curso curso2 = new Curso();
					curso.setNomeCurso("Mecanica");
					curso.setCodigo(1);
					curso.setNomeProfessor("Lex Lutor");
					curso.setCargaHoraria(500);
					curso.setValorCurso(500.00);
					curso.setSala(8);
					
				
					curso2.setNomeCurso("Engenharia");
					curso2.setCodigo(2);
					curso2.setNomeProfessor("Rhuan Pablo");
					curso2.setCargaHoraria(800);
					curso2.setValorCurso(700.00);
					curso2.setSala(8);
					
					listaCurso.add(curso);
					listaCurso.add(curso2);
					
	
				 
					int escolhoCadastro = Integer.parseInt(
						JOptionPane.showInputDialog(
						"Digite o numero do curso que deseja cadastrar "
						+"\n[1]"+listaCurso.get(0).getNomeCurso() +""
						+" / valor: "+listaCurso.get(0).getValorCurso() +"" 
						+" / Carga Horaria  "+listaCurso.get(0).getCargaHoraria() +"" 
						+"\n[2]"+listaCurso.get(1).getNomeCurso()
						+" / valor: "+listaCurso.get(1).getValorCurso() +"" 
						+" / Carga Horaria  "+listaCurso.get(1).getCargaHoraria() +"" 
						)
					 );
						
					
					curso.setAlunos(listaAluno);
					JOptionPane.showMessageDialog(null,  "Cadastro efetuado com sucesso!");
					break;
	
			default:
			
			}

		}else if(menuPrincipal == 3){
		    // curos especialização -----------------------------------------
	
			
			int menuCursosOp =  Integer.parseInt(JOptionPane.showInputDialog(
								"Crie ou escolha um curso"
							   + "\n[1] Cadastro \n[2] Escolher existente\n"));
			ArrayList<Curso> listaCursoEspecializacao = new ArrayList<Curso>();
			switch (menuCursosOp) {
				case 1:
					int opsAddCsMestrado;
					String msgCursoMestrado = "";
				do {
					Curso cursoEspecializacao = new Curso();
					cursoEspecializacao.setNomeCurso(JOptionPane.showInputDialog("Digite o nome do curso: "));
					cursoEspecializacao.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do curso: ")));
					cursoEspecializacao.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do professor: "));
					cursoEspecializacao.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga Horaria: ")));
					while(cursoEspecializacao.getCargaHoraria() == 0) {
						cursoEspecializacao.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("A carga horaria não pode ser 0: ")));
					}
					cursoEspecializacao.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
					while(cursoEspecializacao.getValorCurso()  == 0) {
						cursoEspecializacao.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("O valor do Curso não pode ser zero: ")));
					}
					cursoEspecializacao.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
					
					listaCursoEspecializacao.add(cursoEspecializacao);
					
					opsAddCsMestrado = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um Curso de mestrado?"
																					+ "\n[0] Sim"
																					+ "\n[1] Não"));
				} while (opsAddCsMestrado == 0);
				
				for (Curso saidaCuspMestrado : listaCursoEspecializacao) {
					msgCursoMestrado += saidaCuspMestrado.toString();
				}
				JOptionPane.showMessageDialog(null,  msgCursoMestrado);
				
				break;
					
				case 2:
					Curso cursoEspecializacao = new Curso();
					Curso cursoEspecializacao2 = new Curso();
					cursoEspecializacao.setNomeCurso("Mecanica");
					cursoEspecializacao.setCodigo(1);
					cursoEspecializacao.setNomeProfessor("Lex Lutor");
					cursoEspecializacao.setCargaHoraria(500);
					cursoEspecializacao.setValorCurso(500.00);
					cursoEspecializacao.setSala(8);
					
				
					cursoEspecializacao2.setNomeCurso("Engenharia");
					cursoEspecializacao2.setCodigo(2);
					cursoEspecializacao2.setNomeProfessor("Rhuan Pablo");
					cursoEspecializacao2.setCargaHoraria(800);
					cursoEspecializacao2.setValorCurso(700.00);
					cursoEspecializacao2.setSala(8);
					
					listaCursoEspecializacao.add(cursoEspecializacao);
					listaCursoEspecializacao.add(cursoEspecializacao2);
					
	
				 
					int escolhoCadastro = Integer.parseInt(
						JOptionPane.showInputDialog(
						"Digite o numero do curso que deseja cadastrar "
						+"\n[1]"+listaCursoEspecializacao.get(0).getNomeCurso() +""
						+" / valor: "+listaCursoEspecializacao.get(0).getValorCurso() +"" 
						+" / Carga Horaria  "+listaCursoEspecializacao.get(0).getCargaHoraria() +"" 
						+"\n[2]"+listaCursoEspecializacao.get(1).getNomeCurso()
						+" / valor: "+listaCursoEspecializacao.get(1).getValorCurso() +"" 
						+" / Carga Horaria  "+listaCursoEspecializacao.get(1).getCargaHoraria() +"" 
						)
					 );
						
					
					cursoEspecializacao.setAlunos(listaAluno);
					JOptionPane.showMessageDialog(null,  "Cadastro efetuado com sucesso!");
					break;
	
			default:
			
			}
		
		
		}else if(menuPrincipal == 4){
			    // curos Mestrado-----------------------------------------
			
				int menuCursosOp =  Integer.parseInt(JOptionPane.showInputDialog(
									"Crie ou escolha um curso"
								   + "\n[1] Cadastro \n[2] Escolher existente\n"));
				ArrayList<Curso> listaCursoMestrado = new ArrayList<Curso>();
				switch (menuCursosOp) {
					case 1:
						int opsAddCsMestrado;
						String msgCursoMestrado = "";
						do {
							Curso cursoMestrado = new Curso();
							cursoMestrado.setNomeCurso(JOptionPane.showInputDialog("Digite o nome do curso: "));
							cursoMestrado.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do curso: ")));
							cursoMestrado.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do professor: "));
							cursoMestrado.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga Horaria: ")));
							while(cursoMestrado.getCargaHoraria() == 0) {
								cursoMestrado.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("A carga horaria não pode ser 0: ")));
							}
							cursoMestrado.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
							while(cursoMestrado.getValorCurso()  == 0) {
								cursoMestrado.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("O valor do Curso não pode ser zero: ")));
							}
							cursoMestrado.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
							
							listaCursoMestrado.add(cursoMestrado);
		
							
							opsAddCsMestrado = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais um Curso de mestrado?"
																								+ "\n[0] Sim"
																								+ "\n[1] Não"));
						} while (opsAddCsMestrado == 0);
						
						for (Curso saidaCuspMestrado : listaCursoMestrado) {
							msgCursoMestrado += saidaCuspMestrado.toString();
						}
						JOptionPane.showMessageDialog(null,  msgCursoMestrado);
						
					break;
						
					case 2:
						Curso cursoMestrado = new Curso();
						Curso cursoMestrado2 = new Curso();
						cursoMestrado.setNomeCurso("Mecanica");
						cursoMestrado.setCodigo(1);
						cursoMestrado.setNomeProfessor("Lex Lutor");
						cursoMestrado.setCargaHoraria(500);
						cursoMestrado.setValorCurso(500.00);
						cursoMestrado.setSala(8);
						
					
						cursoMestrado2.setNomeCurso("Engenharia");
						cursoMestrado2.setCodigo(2);
						cursoMestrado2.setNomeProfessor("Rhuan Pablo");
						cursoMestrado2.setCargaHoraria(800);
						cursoMestrado2.setValorCurso(700.00);
						cursoMestrado2.setSala(8);
						
						listaCursoMestrado.add(cursoMestrado);
						listaCursoMestrado.add(cursoMestrado2);
						
		
					 
						int escolhoCadastro = Integer.parseInt(
							JOptionPane.showInputDialog(
							"Digite o numero do curso que deseja cadastrar "
							+"\n[1]"+listaCursoMestrado.get(0).getNomeCurso() +""
							+" / valor: "+listaCursoMestrado.get(0).getValorCurso() +"" 
							+" / Carga Horaria  "+listaCursoMestrado.get(0).getCargaHoraria() +"" 
							+"\n[2]"+listaCursoMestrado.get(1).getNomeCurso()
							+" / valor: "+listaCursoMestrado.get(1).getValorCurso() +"" 
							+" / Carga Horaria  "+listaCursoMestrado.get(1).getCargaHoraria() +"" 
							)
						 );
							
						
						cursoMestrado.setAlunos(listaAluno);

						JOptionPane.showMessageDialog(null,  "Cadastro efetuado com sucesso!");
						break;
		
				default:
				
				}
			
			
		}else if(menuPrincipal == 5){
			

			Aluno aluno2 = new Aluno(); 
			CursoMestrado CursoMestrado = new CursoMestrado();
			ArrayList <CursoMestrado> Listcmt  = new ArrayList <CursoMestrado>();
			
			aluno2.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			aluno2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Código: ")));
			aluno2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Idade: ")));
			while(aluno2.getIdade() <= 0 || aluno2.getIdade() >= 120){
				aluno2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade inválida! Informe Idade novamente: ")));
			}
			aluno2.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
			while(aluno2.getCpf().length() != 11) {	
				aluno2.setCpf(JOptionPane.showInputDialog("CPF deve ter 11 digitos"));
			}
			aluno2.setEndereco(JOptionPane.showInputDialog("Digite seu Endereço: "));
			
			CursoMestrado.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Curso: ")));
			CursoMestrado.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a Carga hóraria do Curso: ")));
			while(CursoMestrado.getCargaHoraria() <=0){
				CursoMestrado.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga inválida! Informe carga novamente: ")));
			}
			CursoMestrado.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
			CursoMestrado.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do Professor: "));
			CursoMestrado.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
			CursoMestrado.setQdtAlunosMestrado(Integer.parseInt(JOptionPane.showInputDialog("Qual a quanidade de alunos na classe; "))); 
			CursoMestrado.AdicionalDisciplinal();


				
			Notas notas2 = new Notas ();
			
			notas2.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1: ")));
			while(notas2.getN1() < 0 || notas2.getN1() > 10.0){
				notas2.setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N1 novamente: ")));
			}
			
			notas2.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2: ")));
			while(notas2.getN2() < 0 || notas2.getN2() > 10.0){
				notas2.setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N2 novamente: ")));
			}
			
			notas2.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3: ")));
			while(notas2.getN3() <  0 || notas2.getN3() > 10.0){
				notas2.setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N3 novamente: ")));	
			}
			
			notas2.setMedia(notas2.getN1(), notas2.getN2(), notas2.getN3());
			aluno2.setNotas(notas2);
		
			listaAluno.add(aluno2);
			
				JOptionPane.showMessageDialog(null, "Dados do Aluno\n"+aluno2.toString());

			
				Listcmt.add(CursoMestrado);
			for (CursoMestrado cursoMestrado :Listcmt){														  // ------------ METODO IMPRIME CURSO DE MESTRADO ---------------//
				 
				JOptionPane.showMessageDialog(null, "Curso Mestrado\n"+cursoMestrado);
			}
			

		}else if(menuPrincipal == 6){
			

			Aluno aluno3 = new Aluno(); 
			CursoMestrado CursoEsp = new CursoMestrado();
			ArrayList <CursoMestrado> ListEsp  = new ArrayList <CursoMestrado>();
			
			aluno3.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
			aluno3.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Código: ")));
			aluno3.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Idade: ")));
			while(aluno3.getIdade() <= 0 || aluno3.getIdade() >= 120){
				aluno3.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade inválida! Informe Idade novamente: ")));
			}
			aluno3.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
			while(aluno3.getCpf().length() != 11) {	
				aluno3.setCpf(JOptionPane.showInputDialog("CPF deve ter 11 digitos"));
			}
			aluno3.setEndereco(JOptionPane.showInputDialog("Digite seu Endereço: "));
			
			CursoEsp.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Curso: ")));
			CursoEsp.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a Carga hóraria do Curso: ")));
			while(CursoEsp.getCargaHoraria() <=0){
				CursoEsp.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga inválida! Informe carga novamente: ")));
			}
			CursoEsp.setSala(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da sala: ")));
			CursoEsp.setNomeProfessor(JOptionPane.showInputDialog("Digite o nome do Professor: "));
			CursoEsp.setValorCurso(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Curso: ")));
			CursoEsp.setQdtAlunosMestrado(Integer.parseInt(JOptionPane.showInputDialog("Qual a quanidade de alunos na classe; "))); 
			CursoEsp.AdicionalDisciplinal();


				
			Notas notas2 = new Notas ();
			
			notas2.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1: ")));
			while(notas2.getN1() < 0 || notas2.getN1() > 10.0){
				notas2.setN1(Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N1 novamente: ")));
			}
			
			notas2.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2: ")));
			while(notas2.getN2() < 0 || notas2.getN2() > 10.0){
				notas2.setN2(Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N2 novamente: ")));
			}
			
			notas2.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3: ")));
			while(notas2.getN3() <  0 || notas2.getN3() > 10.0){
				notas2.setN3(Double.parseDouble(JOptionPane.showInputDialog("Nota inválida! Informe N3 novamente: ")));	
			}
			
			notas2.setMedia(notas2.getN1(), notas2.getN2(), notas2.getN3());
			aluno3.setNotas(notas2);
		
			listaAluno.add(aluno3);
			
				JOptionPane.showMessageDialog(null, "Dados do Aluno\n"+aluno3.toString());

			
				ListEsp.add(CursoEsp);
			for (CursoMestrado cursoEspecializa :ListEsp){														  // ------------ METODO IMPRIME CURSO DE MESTRADO ---------------//
				 
				JOptionPane.showMessageDialog(null, "Curso Mestrado\n"+cursoEspecializa);
			}
			

		}
		


	
	}
	


	
}
