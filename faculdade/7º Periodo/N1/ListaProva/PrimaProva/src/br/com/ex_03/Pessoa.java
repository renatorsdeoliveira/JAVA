package br.com.ex_03;
import java.util.Random;




public class Pessoa {
	
		

		private String nome;
		private char sexo;
		private Dado MeuDado;
		private Data dataNascimento;
		private Endereco endere�o;
		
		
		public Pessoa(String nome, int qntLados)
		{
			this.nome = nome;
			MeuDado = new Dado(qntLados);
		}
		
		public Pessoa()
		{
			MeuDado = new Dado(6);
			
		}
		
		public Pessoa(String nome, Dado d)
		{
			this.nome = nome;
			MeuDado = d;
		}
		
		public String getNome() 
		{
			return nome;
		}
		
		public void setNome(String nome) 
		{
			this.nome = nome;
		}
		
		public Dado getMeuDado() 
		{
			return MeuDado;
		}
		
		public void setMeuDado(Dado meuDado) 
		{
			MeuDado = meuDado;
		}

		public int jogarDado8Faces() {
			Random rd = new Random();
			return rd.nextInt(MeuDado.getQntLados()) +1;
			
		}

		public int jogarDado6Faces() {
			Random rd = new Random();
			return rd.nextInt(MeuDado.getQntLados()) +1;
		}

	}
