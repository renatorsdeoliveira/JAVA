programa
{	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real catetoop, catetoad, hip
		
	escreva("Digite o Cateto adiacente: ")
	leia(catetoad)
	escreva("Digite o Cateto oposto: ")
	leia(catetoop)
	

	hip = mat.raiz(mat.potencia(catetoad, 2.0) + mat.potencia(catetoop, 2.0) ,2.0)
	escreva("A hipotenusa será: ", hip)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */