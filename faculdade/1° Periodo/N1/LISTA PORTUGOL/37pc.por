//37. Escreva um algoritmo para ler os valores de A, B, C e X e calcular o valor de Y 
//usando uma das fórmulas abaixo. Seu algoritmo deve perguntar qual o código da fórmula a ser usada e imprimir os resultados. 
//Deve ser incluído uma verificação para garantir que não ocorra divisão por zero e emitir mensagem, caso ocorra



programa
{	inclua biblioteca Matematica --> m
	funcao tabela()
	{
	escreva("\t\t codigo formula \t\t formula \t\t\n")	
	escreva("\t\t        1       \t\t Y=(AX)2 - BX + C) / (BX - C) \t\t\n")
	escreva("\t\t        2       \t\t Y=(AX)2 + BX + C \t\t\n")
	escreva("\t\t        3       \t\t Y=(AX + CX)3/ (4X) \t\t\n")
	escreva("\t\t        4       \t\t Y=(BX)4.1 \t\t\n")	
	}
	funcao inicio()
	{	
	
		inteiro cd
		real a, b, c, x, y
		

		escreva("Digite o Valor de [A]: ")
		leia(a)
		escreva("Digite o Valor de [B]: ")
		leia(b)
		escreva("Digite o Valor de [C]: ")
		leia(c)
		escreva("Digite o Valor de [X]: ")
		leia(x)

		limpa()
		tabela()
		escreva("Digite o codigo da formula a ser escolhida: ")
		leia(cd)
	
		limpa()
		tabela()
		escolha (cd)
		{
			caso 1:
				y = (m.potencia(a * x, 2.0) - b*x + c) / (b*x - c)
				pare
			caso 2:
				y = m.potencia(a*x, 2.0) + b*x + c
				pare
			caso 3:
				y = (m.potencia(a*x + c*x, 3.0) / (4*x))
				pare
			caso 4:
				y = m.potencia (b*x, 4.0) - 1
				pare
			caso contrario:
				escreva ("Nenhuma opção encontrada escolha de '1 a 4'")
				
		}
			escreva (" O resultado de Y e:", y)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 956; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */