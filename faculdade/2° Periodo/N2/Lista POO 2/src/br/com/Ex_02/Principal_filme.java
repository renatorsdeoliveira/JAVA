package br.com.Ex_02;

	import java.util.ArrayList;
	import java.util.Random;

	import javax.swing.plaf.synth.SynthSeparatorUI;

	import br.com.Ex_02.Ator;
	import br.com.Ex_02.Diretor;
	import br.com.Ex_02.Filme;
	public class Principal_filme {

		public static void main(String[] args) {
		
			chamaExercicio2();
		
		    chamaExercicio2a();
			
			
			/*Criação distinta do exercício 2a, utilizando passagem de parâmetros como referência para os
			 * ArrayLists de atores, atrizes, diretores e filmes.
			 */
			ArrayList <Ator> atores = new ArrayList <Ator>();
			ArrayList <Ator> atrizes = new ArrayList <Ator>();
			ArrayList <Diretor> diretores = new ArrayList <Diretor>();
			ArrayList <Filme> filmes = new ArrayList <Filme>();
			Random rd = new Random();
			
			atores.add(new Ator("Keanu Reeves", 45, 3));
			atores.add(new Ator("Sylvester Stallone", 72, 1));
			
			atrizes.add(new Ator("Megan Fox", 31, 1));
			atrizes.add(new Ator("Angelina Jolie", 42, 0));
			
			diretores.add(new Diretor("Steven Spielberg", true));
			diretores.add(new Diretor("Quentin Tarantino", true));
			diretores.add(new Diretor("Michael Bay", false));
			
			filmes.add(new Filme("Vingadores 200", atores.get(1), atrizes.get(0), diretores.get(0)));
			filmes.add(new Filme("Mundo Perdido", atores.get(rd.nextInt(atores.size())), atrizes.get(rd.nextInt(atrizes.size())), diretores.get(rd.nextInt(diretores.size()))));
			filmes.add(new Filme("Cão", atores.get(rd.nextInt(atores.size())), atrizes.get(rd.nextInt(atrizes.size())), diretores.get(rd.nextInt(diretores.size()))));
			filmes.add(new Filme("Deja Vu", atores.get(rd.nextInt(atores.size())), atrizes.get(rd.nextInt(atrizes.size())), diretores.get(rd.nextInt(diretores.size()))));
			
			for (Diretor diretor : diretores) {
				diretor.setPrincipal_filme(filmes.get(rd.nextInt(filmes.size())));
			}
			
			chamaExercicio2b(atores, atrizes, diretores, filmes);
			
			
			
		
		}

		private static void chamaExercicio2b(ArrayList<Ator> atores, ArrayList<Ator> atrizes, ArrayList<Diretor> diretores,
				ArrayList<Filme> filmes) {
			// TODO Auto-generated method stub
			
			
			if(buscaDiretoresVencedoresDeOscar(diretores)){
				System.out.println("Eis a lista de diretores vencedores de Oscar.");
			}
			else{
				System.out.println("Não há diretores vencedores de Oscar cadastrados.");
			}
			
		}

		private static boolean buscaDiretoresVencedoresDeOscar(ArrayList<Diretor> diretores) {
			// TODO Auto-generated method stub
			
			boolean flag = false;
			
			for (Diretor diretor : diretores) {
				if(diretor.isGanhador_oscar()){
					System.out.println("\n\nNome Diretor: "+diretor.getNome()+"\nNome do Filme: "+diretor.getPrincipal_filme().getTitulo()+"\nNome do Ator: "+diretor.getPrincipal_filme().getAtor_principal().getNome()+"\nNome da Atriz: "+diretor.getPrincipal_filme().getAtriz_principal().getNome());
					flag = true;
				}
			}	
			
			return flag;
		}

		private static void chamaExercicio2a() {
			// TODO Auto-generated method stub
			
			ArrayList <Ator> atores = new ArrayList <Ator>();
			ArrayList <Ator> atrizes = new ArrayList <Ator>();
			ArrayList <Diretor> diretores = new ArrayList <Diretor>();
			ArrayList <Filme> filmes = new ArrayList <Filme>();
			Random rd = new Random();
			
			atores.add(new Ator("Keanu Reeves", 45, 3));
			atores.add(new Ator("Sylvester Stallone", 72, 1));
			
			atrizes.add(new Ator("Megan Fox", 31, 1));
			atrizes.add(new Ator("Angelina Jolie", 42, 0));
			
			diretores.add(new Diretor("Steven Spielberg", true));
			diretores.add(new Diretor("Quentin Tarantino", true));
			
			filmes.add(new Filme("Vingadores 200", atores.get(1), atrizes.get(0), diretores.get(0)));
			filmes.add(new Filme("Mundo Perdido", atores.get(rd.nextInt(atores.size())), atrizes.get(rd.nextInt(atrizes.size())), diretores.get(rd.nextInt(diretores.size()))));
			filmes.add(new Filme("Cão", atores.get(rd.nextInt(atores.size())), atrizes.get(rd.nextInt(atrizes.size())), diretores.get(rd.nextInt(diretores.size()))));
			filmes.add(new Filme("Deja Vu", atores.get(rd.nextInt(atores.size())), atrizes.get(rd.nextInt(atrizes.size())), diretores.get(rd.nextInt(diretores.size()))));
			
			Filme b = buscaFilme("Atoa", filmes);
			
			if(insereFilme(filmes, new Filme("Velozes e Furiosos", atores.get(1), atrizes.get(0), diretores.get(0))))
			{
				System.out.println("Filme adicionado com sucesso!");
			}
			else{
				System.out.println("O filme já existe no ArrayList filmes.");
			}
			
			System.out.println("\n\nArraylist de Filmes");
			for (Filme filme : filmes) {
				System.out.println(filme);
			}
			
		}

		private static boolean insereFilme(ArrayList<Filme> filmes, Filme filme) {
			// TODO Auto-generated method stub
			
			Filme b = buscaFilme(filme.getTitulo(), filmes);
			
			if(b == null)
			{
				filmes.add(filme);
				return true;
			}
			else{
				return false;
			}
			
		}

		private static Filme buscaFilme(String titulo, ArrayList<Filme> filmes) {
			// TODO Auto-generated method stub
			
			for (Filme filme : filmes) {
				if(filme.getTitulo().equalsIgnoreCase(titulo)){
					return filme;
				}
			}
			
			return null;
		}

		private static void chamaExercicio2() {
			// TODO Auto-generated method stub
			Ator ator1 = new Ator("Keanu Reeves", 45, 3);
			Ator atriz1 = new Ator("Megan Fox", 31, 1);
			Diretor diretor1 = new Diretor("Steven Spielberg", true);
			Filme filme1 = new Filme("Os Vingadores 2000", ator1, atriz1, diretor1);
			
			diretor1.setPrincipal_filme(filme1);
			
			System.out.println("Descrição do Filme\n"+filme1);
			System.out.println("Descrição de Direitor\n"+diretor1);
		
			
		}
		

}
