
//33. Desenvolva um programa para calcular e imprimir o preço final de um carro. 
//O valor do preço inicial de fábrica é informado pelo usuário, 
//porém o usuário ainda poderá acrescentar novos recursos cujo os preços estão descritos. 
//O valor total do carro deverá ser o preço inicial de fábrica mais o valor de cada recurso adicionado. 
//? Ar condicionado ? R$ 1750,00 
//? Pintura metálica ? R$ 800,00 
//? Vidro Elétrico ? R$ 1200,00 
//? Direção Hidráulica ? R$ 2000,00 
programa
{	funcao tabela()
	{
	escreva("\t\t Código \t\t    Adicional            \t\t       valor     \t\t\n")
	escreva("\t\t   1    \t\t    Ar condicionado      \t\t    R$ 1750,00   \t\t\n")
	escreva("\t\t   2    \t\t    Pintura metálica     \t\t    R$ 800,00    \t\t\n")
	escreva("\t\t   3    \t\t    Vidro Elétrico       \t\t    R$ 1200,00   \t\t\n")
	escreva("\t\t   4    \t\t    Direção Hidráulica   \t\t    R$ 2000,00   \t\t\n")
	}
	funcao inicio()
	{
		real valor ,vlfinal
		inteiro codigo

		escreva ("Digite o Valor do CARRO $: ")
		leia(valor)
		limpa ()
		tabela()
		escreva("Digite CÓDIGO da peça a ser adicionada: ")
		leia(codigo)

		escolha (codigo)
		{
			caso 1:
				vlfinal = valor + 1750.00
				pare
			caso 2:
				vlfinal = valor + 800.00
				pare
			caso 3:
				vlfinal = valor + 1200.00
				pare
			caso 4:
				vlfinal = valor + 2000.00
				pare
			caso contrario:
				escreva ("Opção não encontrada")
				pare	
		}
		escreva ("O valor total do carro será de $:", vlfinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */