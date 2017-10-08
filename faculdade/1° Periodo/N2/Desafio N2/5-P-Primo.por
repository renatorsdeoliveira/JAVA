programa
{
	funcao inicio()
	{
		inteiro num, divisores, div
		
		para(num=1; num<=1000; num++)
		{
	
			divisores=0
			para(div=1; div<=num; div++)
			{
				se(num%div==0)
				{
					divisores++
				}
			}
				se(divisores==2)
				{
					escreva( num," é Primo\n")
				}
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */