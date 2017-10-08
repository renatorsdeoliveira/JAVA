programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real x1, x2, y1, y2, nm1,nm2
		
		escreva ("Digite X1: ")
		leia (x1)
		escreva ("Digite Y1: ")
		leia (y1)
		escreva ("Digite X2: ")
		leia (x2)
		escreva ("Digite Y2: ")
		leia(y2)
		
		nm1 = mat.potencia(y2 - y1, 2.0) + mat.potencia(x2 - x1, 2.0)
		nm2 = mat.raiz(nm1, 2.0)

		escreva (" a distância euclidiana entre A e B: ", nm2)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 247; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */