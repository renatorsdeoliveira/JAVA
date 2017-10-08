programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		real raio, area, perimetro
		
		escreva("Digite o valor do raio: ")
		leia(raio)
		
		area=mat.PI*mat.potencia(raio,2.0)
		perimetro=2*mat.PI*raio
		
		escreva("Área: ",area,"\tPerimetro: ",perimetro)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 */