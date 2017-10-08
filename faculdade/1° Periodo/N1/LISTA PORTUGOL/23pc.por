
//23. Receba dois números reais do usuário em seguida exiba o resultado de uma operação escolhida também pelo usuário:
//(1) Soma (2) Subtração, (3) Multiplicação e (4) Divisão.  Obs.: No caso da divisão, se o segundo operando for zero exiba 
//?divisão impossível?. 

programa
{
	funcao inicio()
	{
		inteiro n1, n2, op, rs

		escreva ("Digite um numero: ")
		leia(n1)
		escreva ("Digite um numero: ")
		leia(n2)
		escreva ("Digite a operação: ")
		leia(op)

		escolha (op)
		{
		caso 1:
			rs = n1 + n2 
			pare

		caso 2:
			rs = n1 - n2
			pare

		caso 3:
			rs = n1 * n2
			pare

		caso 4:
			se (n2 ==0){
				escreva("Divisão impossivel")
				rs = 0
			}
			senao{
				rs = n1 / n2
			
			}pare

		
			caso contrario:
				escreva ("Conta errada")
			
		}		
		escreva("O resultado da conta: ", rs)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */