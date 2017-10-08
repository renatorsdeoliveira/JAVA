programa
{	
	funcao inicio()
	{
		inteiro qfilhos, q1, q2, c

			q1 =0 
			q2 =0
			c = 0

	enquanto (c < 4)
	{

		escreva("Digite sua quantidade de filhos: ")
		leia(qfilhos)
		
	//enquanto (qfilhos <= 0)
	//{
	//	escreva("Quantidade invalida: ")
	//	leia(qfilhos)
	//}
		se (qfilhos <=2)
		{
			q1 = q1 + 1
		}
		senao 
		{
			q2 = q2 + 1
		}
		c = c +1 
		
	}
	escreva("\nPessoas que possuem filho com  2 anos: ", q1)
	escreva("\nPessoas que possuem filho com  2 anos: ", q2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 115; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */