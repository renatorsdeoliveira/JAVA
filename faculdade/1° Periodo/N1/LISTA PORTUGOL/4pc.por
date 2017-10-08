//4. Escreva um programa que receba a base e a altura de um retângulo. 
//Em seguida, calcule e imprima a área e o perímetro do retângulo.
programa
{
	funcao inicio()
	{
		real base, altura, largura, area, perimetro
		
		escreva ("Escreva a base do triagolo: ")
		leia (base)
		escreva ("Escreva a alutra do triagolo: ")
		leia (altura)
		escreva ("Escreva a largura do triagolo: ")
		leia (largura)
		
		area = base * altura
		perimetro = 2*base + 2*largura

		escreva ("\nA area de seu triangulo e: ", area )
		escreva ("\nA perimetro de seu triangulo e: ", area)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 138; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */