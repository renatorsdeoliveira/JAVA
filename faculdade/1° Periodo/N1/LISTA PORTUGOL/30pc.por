//30. Crie um algoritmo que exiba um cardápio com as opções: 1: Pizza, 2: Picanha e 3:
//Peixe Frito. Ao selecionar uma das opções:1, 2 e 3 deverá exibir a mensagem: ?Opção
//(número) : (nome do prato), pedido realizado com sucesso?.
programa
{	funcao tabela()
	{
		escreva("\n\t\tNumero\tPrato\t\tDesconto")
		escreva("\n\t\t  1  \t  Pizza")
		escreva("\n\t\t  2  \t  Picanha")
		escreva("\n\t\t  3  \t  Peixe Frito")
		
	}

	funcao inicio()
	{
		inteiro op

		
		limpa()
		tabela()

		escreva ("Digite o Numero do Seu pedido: ")
		leia(op)

		enquanto (op < 0 ou op > 3)
		{
			escreva("Nuimero Invalido digite de 1 a 3: ")
			leia(op)
		}

		se (op ==1)
		{
			escreva ("Numero: 1 \nPrato: Pizza - Pedido Realizado")
		}
		senao se(op ==2)
		{
			escreva ("Numero: 2 \nPrato: Picanha - Pedido Realizado")
		}
		senao
		{
			escreva ("Numero: 3 \nPrato: Peixe Frito - Pedido Realizado")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */