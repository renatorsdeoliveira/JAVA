//8. Faça um algoritmo que recebe o raio de uma esfera e calcula o seu volume (v = 4/3.P .R3), e a área (a = P.R²). 
programa
{	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		real raio, v,a

		escreva("Digite o Raio de uma esfera: ")
		leia(raio)

		v = (4/3*m.PI )* m.potencia(raio, 3.0)
		a = m.PI* m.potencia(raio, 2.0)

		escreva("O volume do Raio é: ", v," e a área é: ", a)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */