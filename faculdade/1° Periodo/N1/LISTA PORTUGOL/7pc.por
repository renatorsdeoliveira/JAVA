//Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
//A fórmula de conversão de temperatura a ser utilizada é C = (F ? 32) * 5 / 9,
//em que a variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus Celsius.
programa
{
	funcao inicio()
	{
		inteiro f, co
		 escreva ("Digite o numero em graus Fahrenheit: ")
		 leia (f)
		 
		co = (f - 32) * 5 / 9

		escreva ("\nTempareratura em Celsius: ", co)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */