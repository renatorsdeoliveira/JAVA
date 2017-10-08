programa
{
	funcao inicio()
	{
		
		inteiro n, c
		escreva("Digite um numero: ")
		leia(n)
		
		enquanto (n < 0)
		{
			escreva("N invalido, informe somente numeros positivos\n tente novamente ")
			leia (n)
		}
		
		c = 1

		enquanto (c <= 10)
		{
		escreva ("\n",n ," x ", c," = ", n * c)
		c = c + 1
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 */