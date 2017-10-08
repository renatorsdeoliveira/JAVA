//Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto variável informado pelo vendedor. 
//Escreva um programa que leia o valor original do produto e o valor do desconto oferecido pelo vendedor 
//e imprima o novo valor do produto. 
programa
{
	funcao inicio()
	{
		real vp, vd, operacao, desconto
		
		escreva ("Escreva o valor do produto; ")
		leia (vp)
		escreva ("Escreva o valor do desconto a ser dado; ")
		leia (vd)

		operacao = vp * vd/100 
		desconto = vp - operacao

		escreva ("O valor final so produto é: ", desconto)
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */