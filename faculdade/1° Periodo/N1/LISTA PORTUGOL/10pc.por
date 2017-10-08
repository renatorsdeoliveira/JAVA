//10. Para o cálculo de vários tributos, a base de cálculo é o salário mínimo. 
//Faça um programa que leia o valor do salário mínimo e o valor do salário de uma pessoa. 
//Calcule e imprima quantos salários mínimos a pessoa ganha. 
programa
{
     inclua biblioteca Matematica --> mat
	funcao inicio()
	
	{
		
		real sm, sf, div
		
		escreva ("Digite o valor do salário mínimo: ")
		leia (sm)
		escreva ("Digite o valor do seu salário: ")
		leia (sf)

			div = mat.arredondar ((sf / sm),2)
			

		escreva ("\n O numero de slários que você recebe e de: ", sub )

		
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */