programa
{
	funcao inicio()
	{
		caracter s
		real a, p, peso

		escreva("Digite sua altura: ")
		leia (a)
		
		escreva("Digite M para masculino  e F para feminino: ")
		leia (s)

		se (s == 'm') {
		p = (72.7 * a) - 58

		}
		senao {	
		p = (62.1 * a)- 44.7	
		}

		escreva ("Digite seu Peso: ")
		leia(peso)

		se (peso > p){
		escreva ("\nAtenção ", peso -  p, " acima do peso Ideal")

		}
		senao {
		escreva ("\nVocê Está dentro do peso")
		}
	
		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */