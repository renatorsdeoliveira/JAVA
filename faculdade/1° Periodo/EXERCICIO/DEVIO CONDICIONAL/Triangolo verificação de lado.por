programa
{
	funcao inicio()
	{
		real a, b, c 

		escreva("Digite o lado a: ")
		leia (a)
		escreva("Digite o lado b: ")
		leia (b)
		escreva("Digite o lado c: ")
		leia (c)


		se ((a<b+c) e (b<a+c) e (c<a+b))
		{
			
		escreva ("As meidas formam um triangolo\n ")
	
			se (a==b e b==c)
			{
			escreva (": Triangulo Equilatero")	
			}
			senao se (a==b ou b==c ou c==b)
			{
			escreva (": Triangulo Isoceles")
			}
			senao 
			{
			escreva (": Triangulo Isoceles")
			}
		}
		senao
		{
		escreva ("As medidas não formam um triangolo")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */