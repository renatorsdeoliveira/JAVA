//3. Faça um programa que leia um número inteiro entre 1 e 5 e escreva ?ENTRADA
//VÁLIDA?. Caso o usuário digite um número que não esteja neste intervalo,
//screva ?ENTRADA INVÁLIDA.
programa
{
	funcao inicio()
	{
		inteiro v

		escreva ("Digite um numero de 1 a 5: ")
		leia (v)

		se (v >= 0 e v < 6)
		{
			escreva ("Entrada VÁLIDA")
		}
		senao 
		{
			escreva ("Entrada INVÁLIDA ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */