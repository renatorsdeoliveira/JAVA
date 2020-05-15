package br.com.dado;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont1 = 0, cont2 = 0, sair ;

		
		System.out.print("Jogo inspirado em nosso excelentíssimo professor Luiz Mário,\nque amamos muito, muito, muito, muito, mesmo \ndigas de nomes, o dele [Luiz Mário]  e o seu. \nBom Jogo! ;)\n\n");
		
		Pessoa professorLuizBondoso = new Pessoa();
		Pessoa alunoRenatoSeEsforcandoComJava = new Pessoa();

		do {
			Scanner entrada = new Scanner(System.in);
			
			System.out.print("Digite o nome do professor: ");
			professorLuizBondoso.setNome(entrada.nextLine());
			
			System.out.print("Digite o nome do aluno: ");
			alunoRenatoSeEsforcandoComJava.setNome(entrada.nextLine());
			
			System.out.print("\nJogando os dados ...");
			System.out.print("\n\n");
			
				
			for(int i = 1; i <= 5; i++) {
	
				int ladosLuizBondoso = professorLuizBondoso.jogarDado();
				int ladosRenatoSeEsforcando = alunoRenatoSeEsforcandoComJava.jogarDado();
			
				if(ladosLuizBondoso > ladosRenatoSeEsforcando) {
					System.out.println("-----------------------------------------------------");
					System.out.println("Rodada " + i + ": Professor " + professorLuizBondoso.getNome() + " venceu");
					System.out.println(professorLuizBondoso.getNome() + " tirou: " + ladosLuizBondoso);
					System.out.println(alunoRenatoSeEsforcandoComJava.getNome()  + " tirou: " + ladosRenatoSeEsforcando);
	
					cont1++;
				}
				else if(ladosLuizBondoso < ladosRenatoSeEsforcando) {
					System.out.println("-----------------------------------------------------");
					System.out.println("Rodada " + i + ": Aluno "+ alunoRenatoSeEsforcandoComJava.getNome() + " venceu");
					System.out.println(professorLuizBondoso.getNome() + " tirou: " + ladosLuizBondoso);
					System.out.println(alunoRenatoSeEsforcandoComJava.getNome()  + " tirou: " + ladosRenatoSeEsforcando);
	
					cont2++;
				}
				else {
					System.out.println("-----------------------------------------------------");
					System.out.println("Rodada " + i + ": Empate nenhum ganhadores;");
				
				}
			}
			
			System.out.println("\n\n-----------------------------------------------------");
			System.out.println("-----------------------------------------------------");

			if(cont1 > cont2) {
				System.out.println("Professor "+ professorLuizBondoso.getNome() + " ganhou!!!: rerere vou passar mais tarefas. (^-^)");
				System.out.println("Aluno "+ alunoRenatoSeEsforcandoComJava.getNome() + ": (O_o) U Q?  ");
		
			}
			else if(cont1 < cont2) {
				System.out.println("Aluno "+ alunoRenatoSeEsforcandoComJava.getNome() + " ganhou!!!: "+professorLuizBondoso.getNome()+ " lhe dará um ponto na média. (^-^)");
				System.out.println("Professor "+ professorLuizBondoso.getNome() + ": nem a pau juvenal, mais tarefas rerere. (^-^)");
				System.out.println("Aluno "+ alunoRenatoSeEsforcandoComJava.getNome() + ": (x_x)");
			}
			else {
				System.out.println("Empate, não ouve ganhadores.");
			}
			
			System.out.print("\nPara Jogar novamente digite 1 para sair digite 0:");
			sair = entrada.nextInt();
		
			if(sair != 1) {
				System.out.print("\nFim de jogo!");
			}
			
		} while (sair == 1);
			
	
		
		
	}

}
