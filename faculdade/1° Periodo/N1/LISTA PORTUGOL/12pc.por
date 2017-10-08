
//Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores recebe, 
//mensalmente, um salário fixo (que representa 2*salarioMinimo) mais a comissão. 
//Essa comissão é calculada em relação ao número de televisores vendidos por mês de cada um dos tipos de TV,
//obedecendo as seguintes especificações: 
programa
{	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real x1, x2, y1, y2, nm1
	escreva ("Digite a istancia entre 2 pontos: ")
	leia (x1)	
	escreva ("Digite x2: ")
	leia (x2)
	escreva ("Digite y1: ")
	leia (y1)
	escreva ("Digite y2: ")
	leia (y2)
	
	
	nm1 = mat.raiz(mat.potencia(x2 - x1, 2.0) + mat.potencia(y2 - y1, 2.0) ,2.0)

	escreva ("A Distancia entre os dois pontos e: ", nm1)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */