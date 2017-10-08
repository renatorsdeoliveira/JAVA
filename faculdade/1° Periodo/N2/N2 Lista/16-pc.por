programa
{
	funcao inicio()
	{
		inteiro n, c

		
		faca{
		escreva("Informe um Numero: ")
		leia(n)

		escreva ("\nTabuada de ", n,"\n")
		se(n<0 ou n>10)
			escreva ("Digite um numero entre 0 e 10 \n")
		}enquanto(n<0 ou n>10)
		para (c=1; c<=10; c++)
		{	
			escreva (n ," x ", c, " = ",n * c, "\n")		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */