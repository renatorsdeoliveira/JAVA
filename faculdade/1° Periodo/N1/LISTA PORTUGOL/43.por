programa
{
	funcao inicio()
	{
		inteiro  contador = 1
		real numero, media, soma = 0.0

		
		enquanto (contador <= 10)
		{
		
		escreva ("Digite a Media: ")
		leia (numero)
		limpa()
		enquanto (numero >10 ou numero <0)
		{
			escreva ("Não existe meidia menor que [0] ou maior que [10]\nDigite a media novamente: ")
			leia(numero)
		}
		limpa()
		soma = soma + numero 
		contador ++
		}
		media = numero / 10
		
		limpa()
		escreva("A média dos números é: ", media, "\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */