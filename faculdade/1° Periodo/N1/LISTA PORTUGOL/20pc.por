//20. Crie um programa que leia um valor inteiro e diga se ele é positivo, negativo ou nulo.

programa
{
	funcao inicio()
	{
		inteiro numero
		
		escreva("Digite um número inteiro: ")
		leia(numero)

		se(numero > 0) 
		{ 
			escreva("O número é positivo")
		}
		senao se(numero < 0) 
		{ 
			escreva("O número é negativo")
		}
		senao 
		{
			escreva("O número é nulo")
		}

		escreva("\n")		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */