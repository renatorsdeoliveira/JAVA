//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
//(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 12% do preço de fábrica
// e os impostos de 30% do preço de fábrica, faça um programa para ler o custo de fábrica de um carro e imprimir o custo ao consumidor. 
 
programa
{
	funcao inicio()
	{
		real cf, pd, ip, soma
		
		escreva ("Digite o custo de fabrica: ")
		leia (cf)

		pd =  cf  * 0.12
		ip = cf * 0.30
		
		soma = pd + ip
	
		

		escreva ("\nSeu custo é: ", soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 228; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */