programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real resultado, base, expoente 

	escreva("Informe a base: ")
	leia (base)
	escreva("Informe o expoente: ")
	leia(expoente)

	resultado = mat.arredondar(mat.potencia(base, expoente), 2)

	escreva("o resultado é: ", resultado)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 */