package br.com.interfa;

import java.util.ArrayList;

public class PrincipalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaIIn aluno = new PessoaIIn("Renato", "Oliveira");
		PessoaIIn aluno2 = new PessoaIIn("Aline", "Oliveira");
		PessoaIIn aluno3 = new PessoaIIn("Aline", "Oliveira");
		
		aluno.nomeCompleto();
		aluno2.nomeCompleto();
		aluno3.nomeCompleto();
		
//		System.out.println(aluno.nomeCompleto());
		
		ArrayList<PessoaIIn> lista = new ArrayList<PessoaIIn>();
		lista.add(aluno);
		lista.add(aluno2);
		lista.add(aluno3);
		
		for (PessoaIIn pessoa: lista) {
			System.out.println(pessoa.nomeCompleto());
		}
		

	}

}
