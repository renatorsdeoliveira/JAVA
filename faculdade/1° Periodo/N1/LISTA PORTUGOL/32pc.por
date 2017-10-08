//32. Construa um programa que receba a idade de uma pessoa e classifique-a seguindo o critério apresentado a seguir.
//Considere a idade é um valor inteiro e que será informada de forma válida.  

programa
{	funcao tabela()
	{
		escreva("\n\t\t    idade     \t\t Clasificação")
		escreva("\n\t\t  0 a 2 anos  \t\t Recém-nas")
		escreva("\n\t\t  3 a 11 anos \t\t criança")
		escreva("\n\t\t 12 a 19 anos \t\t Adolecente")
		escreva("\n\t\t 20 a 55 anos \t\t Adulto")
		escreva("\n\t\t Acima de 55 anos \t Idoso\n")
		
	}
	funcao inicio()
	{
		
		inteiro id
		limpa()
		tabela()

		escreva ("\nDigite sua idade: ")
		leia (id)
		
		enquanto (id <0)
		{
			escreva("Não existe idade negativa digite um numero acima de Zero: ")
			leia (id)
		}

		se (id > 0 e id < 3)	
		{
			escreva("Recém-nascido")
		}
		senao se (id > 2 e id <12 )
		{
			escreva ("Criança")
		}
		senao se (id > 11 e id < 20)
		{
			escreva ("Adolecente")
		}
		senao se (id > 19 e id < 56)
		{
			escreva ("Adulto")
		}
		senao se (id >  55)
		{
			escreva ("Idoso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */