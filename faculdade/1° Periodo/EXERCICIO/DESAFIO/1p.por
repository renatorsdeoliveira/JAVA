//1. Crie um programa para determinar se um número inteiro A é divisível por outro
//número B. Os valores devem ser fornecidos pelo usuário.

programa
{
	funcao inicio()
	{
		inteiro a, b
		
		escreva("Digite o numero A: ")
		leia (a)
		escreva("Digite o numero B: ")
		leia (b)
		
		
		
		se (a % b == 0)
		{
		escreva (a, " e divisivel por ", b)
		}
		senao 
		{
			escreva (a," não e Divisivel por ",b)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */