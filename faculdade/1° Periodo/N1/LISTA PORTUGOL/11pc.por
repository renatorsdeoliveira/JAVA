
//Numa certa loja de eletrodomésticos, o comerciário encarregado da seção de televisores recebe
//, mensalmente, um salário fixo (que representa 2*salarioMinimo) mais a comissão. 
//Essa comissão é calculada em relação ao número de televisores vendidos por mês de cada um dos tipos de TV, 
//obedecendo as seguintes especificações: 
programa
{
	funcao inicio()
	{
		real lcd, led, plasma, c, l, p, t

		escreva ("Digite a quantidade de tvs de LCD: ")
		leia (lcd)
		escreva ("Digite a quantidade de tvs de LED: ")
		leia (led)
		escreva ("Digite a quantidade de tvs de Plasma: ")
		leia (plasma)

		c = lcd * 50.00 
		l = led * 60.00 
		p = plasma *75.00
		t = c + l + p + 1874 

		escreva ("Salario total:", t)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */