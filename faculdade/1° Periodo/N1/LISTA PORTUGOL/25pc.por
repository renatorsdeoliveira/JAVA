
//25. Incremente o programa anterior onde caso a pessoa seja maior de idade verifique se ela
//tem mais de 65 anos, ou caso seja menor de idade verifique se ela é menor de 12 anos.
programa
{
	funcao inicio()
	{

		inteiro idade

		
		escreva("Digite sua idade: ")
		leia (idade)

		enquanto (idade <  0)
		{
			escreva("Não existe idade Negativa digite numeros positivos\n") 
			leia (idade)
		}
		se (idade  >  0 e idade <  12)
		{
		escreva ("Menor de idade Com menos de 12 Anos")
		}
		senao se (idade > 13 e idade <=  17)
		{
			escreva ("Menor de idade")
		}
		senao se (idade >= 18 e idade < 65 )
		{
			escreva ("Maior de Idade")
		}
		senao 
		{
			escreva ("Maior de Idade Com mais de 65 Anos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */