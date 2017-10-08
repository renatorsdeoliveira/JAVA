//2. Incremente o programa anterior. Caso o número digitado for positivo, informe se
//ele é PAR ou IMPAR. Caso o número digitado for negativo apresente o valor do numero².

programa
{	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		inteiro a, b
		
		escreva("Digite o numero A: ")
		leia (a)
		escreva("Digite o numero B: ")
		leia (b)
		
		
		
		se (a % b == 0 )
		{
			escreva (a, " e divisivel por ", b," numero PAR")
		}
		senao se (a % b < 0)
		{
			escreva ("esté numero e Negativo: ", m.potencia(a , 2.0) )
		}
		
		senao 
		{
			escreva (a," não e Divisivel por ", b,"numero IMPAR")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 460; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */