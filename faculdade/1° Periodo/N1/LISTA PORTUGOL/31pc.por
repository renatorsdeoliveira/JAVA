//31. Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir. 
//Escreva um programa que leia o valor da compra e imprima o valor da venda do produto
programa
{
	funcao inicio()
	{
		real venda, compra
		
		escreva ("Digite o valor da Compra: ")
		leia (compra)

		enquanto (compra <0)
		{
			escreva("Não existe idade negativa digite um numero acima de Zero: ")
			leia (compra)
		}

		se (compra < 10.00)
		{
			venda = compra + (compra * 0.7)
			escreva ("Esté e o valor da Venda: ",venda)
		}
		senao se (compra <=10.00 e compra < 30.00)
		{
			venda = compra + (compra * 0.5)
			escreva ("Esté e o valor da Venda: ",venda)
		}
		senao se (compra <=30.00 e compra < 50.00)
		{
			venda = compra + (compra * 0.4)
			escreva ("Esté e o valor da Venda: ",venda)
		}
		senao
		{
			venda = compra + (compra * 0.3)
			escreva ("Esté e o valor da Venda: ",venda)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */