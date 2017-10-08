package br.com.Lista;

import javax.swing.JOptionPane;

public class EX_25 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			double nota1, nota2, media, mediaClasse, maiorMedia = 0, menorMedia = 0, somaMedia = 0.0;
			String nome, nomeMaior = null, nomeMenor = null;
			int continuar, totalAlunos = 0, qtdAprovados = 0, qtdReprovados = 0, qtdExame = 0;

			do{
				nome = JOptionPane.showInputDialog("Informe seu nome");
				do{
					nota1 = Double.parseDouble(JOptionPane.showInputDialog(nome + " informe sua nota 1"));
					if(nota1 < 0 || nota1 > 10)
						JOptionPane.showMessageDialog(null, "NOTA INVALIDA! Tente novamente!");
				}while(nota1 < 0 || nota1 > 10);
				
				do{
					nota2 = Double.parseDouble(JOptionPane.showInputDialog(nome + ", informe sua Nota 2"));
					if(nota2 < 0 || nota2 > 10)
						JOptionPane.showMessageDialog(null, "NOTA INVALIDA! Tente novamente!");
				}while(nota2 < 0 || nota2 > 10);
				
				media = (nota1 + nota2) / 2;
				totalAlunos++;
				
				if(media < 3){
					JOptionPane.showMessageDialog(null, nome +", está reprovado, com média = "+media);
					qtdReprovados++;
				}
				else if(media >= 3 && media < 7)
				{
					JOptionPane.showMessageDialog(null, nome + ", está de exame, com média = "+media);
					qtdExame++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, nome+ ", está Aprovado, com média = "+media);
					qtdAprovados++;
				}
				
				somaMedia += media; // somaMedia = somaMedia + media; **mesma coisa**
				
				if(totalAlunos == 1){
					nomeMaior = nome;
					nomeMenor = nome;
					maiorMedia = media;
					menorMedia = media;
				}
				else{
					if(media > maiorMedia){
						maiorMedia = media;
						nomeMaior = nome;
					}
					
					if(media < menorMedia){
						menorMedia = media;
						nomeMenor = nome;
					}
				}
				
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			}while(continuar == 0);
			
			mediaClasse = somaMedia/totalAlunos;
			
			String mensagem = "RELATORIO FINAL DA TURMA\n"+
								"Total alunos: "+totalAlunos+
								"\nQuantidade de alunos aprovados: "+qtdAprovados+
								"\nQuantidade de alunos de exame: "+qtdExame+
								"\nQuantidade de alunos reprovados: "+qtdReprovados+
								"\nMédia da Classe: "+mediaClasse+
								"\nAluno com a maior Média: "+nomeMaior+" com média: "+maiorMedia+
								"\nAluno com a menor Média: "+nomeMenor+" com média: "+menorMedia;
			
			JOptionPane.showMessageDialog(null, mensagem);
								
			
		}
	}


