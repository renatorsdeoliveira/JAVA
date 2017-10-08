programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util --> ut
	funcao inicio()
	{
	real resultado, base, expoente 

	escreva("Informe a base: ")
	base = ut.sorteia(1 , 10 )
	escreva("Informe o expoente: ")
	expoente = ut.sorteia(1 , 10)

	resultado = mat.arredondar(mat.potencia(base, expoente), 2)

escreva(base , " ^ ", expoente, " = ", resultado)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 */