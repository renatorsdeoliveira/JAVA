//15. Numa determinada região, o imposto sobre propriedade é calculado a partir de duas informações: 
//- área total do terreno (m2). 
//- área construída do terreno (m2). 
//O imposto é cobrado da seguinte maneira: 
//- R$ 5,00 para cada metro quadrado construído. 
//- R$ 3,80 para cada metro quadrado não construído. 
///Faça um programa que leia a área total do terreno, a área construída do terreno,
//calcule e imprima o valor total a ser pago. 
programa
{
	funcao inicio()
	{
		real t, c, div, mc, mt
		escreva ("Digite o tamanho do terreno em m2: ")
		leia (t)
		escreva ("Digite a area construida: ")
		leia (c)

		div = t - c
		mc = c * 5.00
		mt = div * 3.80
		
		escreva ("\nO 'Valor a ser pago por metro quadrado construido e: ", mc)
		escreva ("\nO valor a ser pago por metro quadrado não construida e: ", mt)

	}
}		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */