programa
{
	funcao tabela()
	{
		escreva("\n\t\tCodigo\tCondição de Pagamento\t\tDesconto")
		escreva("\n\t\t  0  \t  A VISTA  \t\t\t  25%")
		escreva("\n\t\t  1  \t  Cheque (30 dias)  \t\t  20%")
		escreva("\n\t\t  2  \t  Cartão de Crédito (2x)  \t  10%")
		escreva("\n\t\t  3  \t  Cartão de Crédito (3x)  \t  5%")
		escreva("\n\t\t  4  \t  Negociado vendedor\t\tSem desconto")
	}
	
	funcao inicio()
	{
		inteiro codigo
		real precoEtiqueta, precoPagar
		
		escreva("Informe o preço de etiqueta do produto: ")
		leia(precoEtiqueta)
		
		limpa()
		tabela()
		
		escreva("\nInforme o codigo do Pagamento: ")
		leia(codigo)

		escolha (codigo)
		{
			caso 0:
				precoPagar = precoEtiqueta - (precoEtiqueta*0.25)
				pare
			caso 1:
				precoPagar = precoEtiqueta - (precoEtiqueta*0.2)
				pare
			caso 2:
				precoPagar = precoEtiqueta - (precoEtiqueta*0.1)
				pare
			caso 3: 
				precoPagar = precoEtiqueta - (precoEtiqueta*0.05)
				pare
			caso 4:
				precoPagar = precoEtiqueta
				pare
			caso contrario:					
				escreva("Código informado inválido. ")
		}

		escreva("\n\nO produto custará R$ ", precoPagar, " reais.")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 495; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */