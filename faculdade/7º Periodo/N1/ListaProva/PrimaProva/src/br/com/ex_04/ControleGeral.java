package br.com.ex_04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ControleGeral {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

        int opc = 0, menu = 0;
    
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
        ArrayList<ProfPesquisador>listaPesquisadores = new ArrayList<>();
        ArrayList<Notas> listaNotas = new ArrayList<Notas>();
        String msg = "";

        do {
            do {
                
                menu = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero da op��o desejada para cadastro:\n\n" + 
                "[1] Alunos\n"+
                "[2] Professores\n" +
                "[3] Professores Pesquisadores\n\n"));
            
                if(menu != 1 & menu != 2 & menu != 3){
                    JOptionPane.showMessageDialog(null,"O n�mero digitado n�o corresponde aos n�meros do menu. Tente novamente!" );
                }
            
            }while(menu != 1 & menu != 2 & menu != 3);
        
            if(menu == 1){	

                Aluno aluno = new Aluno();
                Notas notas = new Notas();

                aluno.setNome( JOptionPane.showInputDialog("Informe o nome do aluno:"));
                aluno.setTelefone(JOptionPane.showInputDialog("Informe o telefone do aluno:"));
                aluno.setIdentidade( Integer.parseInt(JOptionPane.showInputDialog("Informe a identidade do aluno:")));
                aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno: ")));
                aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do aluno: ")));
                aluno.setCpf(JOptionPane.showInputDialog("Informe o CPF do aluno:"));
                                        
                notas.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Informe a N1 do aluno")));
                while(notas.getNota1() < 0 || notas.getNota1() > 10) {	
                    notas.setNota1(Integer.parseInt(JOptionPane.showInputDialog("A noata tem quer ser entre 0 a 10")));  
                }

                notas.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Informe a N2 do aluno")));
                while(notas.getNota2() < 0 || notas.getNota2() > 10) {	
                    notas.setNota2(Integer.parseInt(JOptionPane.showInputDialog("A noata tem quer ser entre 0 a 10")));  
                }
                    
                notas.setNota3(Integer.parseInt(JOptionPane.showInputDialog("Informe a N3 do aluno")));
                while(notas.getNota3() < 0 || notas.getNota3() > 10) {	
                    notas.setNota3(Integer.parseInt(JOptionPane.showInputDialog("A noata tem quer ser entre 0 a 10")));  
                }
                    
                
                listaAlunos.add(aluno);
                listaNotas.add(notas);
                
            }
            else if(menu == 2){

                Professor professor = new Professor();
                professor.setNome( JOptionPane.showInputDialog("Informe o nome do professor:"));
                professor.setTelefone(JOptionPane.showInputDialog("Informe o telefone do professor:"));
                professor.setIdentidade( Integer.parseInt(JOptionPane.showInputDialog("Informe a identidade do professor:")));
                professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor: ")));
                professor.setCpf(JOptionPane.showInputDialog("Informe o CPF do professor:"));
                professor.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: ")));
                listaProfessores.add(professor);
            }
            else if(menu ==3){

                ProfPesquisador pfPesquisador = new ProfPesquisador();
                pfPesquisador.setNome( JOptionPane.showInputDialog("Informe o nome do professor pesquisador:"));
                pfPesquisador.setTelefone(JOptionPane.showInputDialog("Informe o telefone do professor pesquisador:"));
                pfPesquisador.setIdentidade( Integer.parseInt(JOptionPane.showInputDialog("Informe a identidade do professor pesquisador:")));
                pfPesquisador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor pesquisador: ")));
                pfPesquisador.setCpf(JOptionPane.showInputDialog("Informe o CPF do professor pesquisador:"));
                pfPesquisador.setHoras(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas de pesquisa")));
                listaPesquisadores.add(pfPesquisador);
            }
        
            opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer um novo cadastro?\n\n [1]Sim           [2]Não"));
            
        }while(opc == 1);

        int menuSaida = 0;

        menuSaida = Integer.parseInt(JOptionPane.showInputDialog("Deseja imprimir alguma lista" +
        "\n[1] Lista de Aluno"+
        "\n[2] Lista de professor"+ 
        "\n[3] Lista de professores pesquisadores"+
        "\n[4] Sair"
        ));

        if(menuSaida == 1){

            for (Aluno saidaAluno : listaAlunos) {
                msg +=  saidaAluno;
            }

            for (Notas saidaNota : listaNotas) {
              msg +=  saidaNota;
            }
           
            JOptionPane.showMessageDialog(null, msg);
        }else if(menuSaida == 2){

            for (Professor saidaProfessor : listaProfessores) {
                msg +=  saidaProfessor;
            }

            JOptionPane.showMessageDialog(null, msg);
        }else if(menuSaida == 3){

            for (ProfPesquisador saidaPesq : listaPesquisadores) {
                msg +=  saidaPesq;
            }
            
            JOptionPane.showMessageDialog(null, msg);

        }else if(menuSaida == 4){
            JOptionPane.showMessageDialog(null, "Saindo ...");
        }else{
            JOptionPane.showMessageDialog(null, "Numero incorreto");
        }
        

    }

    
}