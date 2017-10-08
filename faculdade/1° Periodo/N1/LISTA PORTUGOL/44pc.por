//44. Escreva um programa que leia o nome e a idade de vários usuários,
//e imprima a seguinte mensagem ?O usuário *nome* tem *anos* anos de vida?. 
//O programa deverá continuar executando enquanto o usuário informar que deseja continuar. 
 
programa
{
	funcao inicio()
	{
		caracter nome
		inteiro idade, c, idadef

		c = 0

		enquanto (c <4)
		{
			escreva ("Digite seu nome: ")
			leia (nome)
			escreva ("Digite o ano que você nasceu: ")
			leia (idade)

			idadef =  2017 - idade
			escreva(nome , " e sua idade e " , idadef ,"\n")
			
			
		}
		c++
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */