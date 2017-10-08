
//24. Escreva um programa que leia o nome e a idade de uma pessoa e informe se ela é maior ou menor de idade.//

programa
{
	funcao inicio()
	{
		cadeia nome 
		inteiro idade

		escreva ("Digite seu nome: ")
		leia (nome)
		
		escreva ("Digite sua idade: ") 
		leia (idade)

		

		se (idade < 18 ) {
			escreva ("", nome," Menor de Idade")
		}
		senao  {
			escreva (" Maior de Idade")
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */