//42. Escreva um programa que receba a idade de várias pessoas (para teste utilize 10 pessoas). 
//Calcule e imprima: a quantidade de pessoas com até 18 anos; 
//quantidade de pessoas entre 18 e 65 anos; quantidade de pessoas com mais de 65 anos. 
programa
{
	funcao inicio()
	{
		inteiro q1, q2, q3, c, idade
		
		

		q1 = 0
		q2 = 0
		q3 = 0
		c  = 0

	enquanto (c < 10)
	{
		escreva ("Digite sua idade: ")
		leia (idade)
	enquanto (idade <=0)
	{
		escreva ("Não existe idade negativa digite um numero positivo: ")
		leia (idade)
	}
		se (idade <=17)
		{
			q1 = q1 + 1
		}
		senao se (idade <=64)
		{
			q2 = q2 + 1
		}
		senao 
		{
			q3 = q3 +1 
		}
		c++
		
	}
	
	     escreva("\nPessoas menores de 18 anos: ", q1)
	     escreva("\nPessoas maiores de 18 anos: ", q2)
	     escreva("\nPessoas com mais de 65 anos: ", q3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 663; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */