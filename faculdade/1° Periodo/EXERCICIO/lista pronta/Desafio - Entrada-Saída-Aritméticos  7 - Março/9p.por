programa
{
	funcao inicio()
	{
		inteiro n, u, d, c, m

		escreva ("Digite aqui seu numero: ")
		leia (n)

		c = n / 100
		d = (n % 100) / 10
		u = (n % 100) % 10 

		m = u * 100 + d * 10 + c * 1
		
	escreva ("\nDigito da Centena:", c/1,"\nDigito da Dezena: ", d/1,"\nDigito da Unidade: ", u/1)
		escreva ("\nSeu numero invertido e: ", m)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 */