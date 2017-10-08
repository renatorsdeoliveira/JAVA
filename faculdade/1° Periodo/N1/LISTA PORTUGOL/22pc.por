//22. Escreva um programa que leia três valores inteiros distintos 
//(assuma que o usuário digitará valores diferentes entre si) e os armazene nas variáveis A, B e C. 
//Em seguida, descubra o menor valor e o armazene em uma variável denominada MENOR; 
//o maior valor, coloque-o na variável MAIOR e o valor intermediário, na variável INTER.
// Imprima os valores em ordem crescente, ou seja, imprima as variáveis MENOR, INTER e MAIOR, nessa ordem.
programa
{
	funcao inicio()
	{

	inteiro a, b, c, menor, maior, inter

	escreva ("Digite um Valor Distinto: ")
	leia(a)
	escreva ("Digite mais um Valor Distinto: ")
	leia(b)
	escreva ("Digite mais um Valor Distinto: ")
	leia(c)
	
		se (a>b e a>c e b>c)
		{
			escreva ("\nMaior Valor: ", a,"\n")
			escreva ("Valor Intermediario: ", b,"\n")
			escreva ("Menor Valor: ", c,"\n")
		}
		senao se (b>a e b>c e a>c)
		{
			escreva ("\nMaior Valor: ", b,"\n")
			escreva ("Valor Intermediario: ", a,"\n")
			escreva ("Menor Valor: ", c,"\n")
			
		}
		senao 
		{
			escreva ("\nMaior Valor: ", c,"\n")
			escreva ("Valor Intermediario: ", b,"\n")
			escreva ("Menor Valor: ", a,"\n")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1026; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */