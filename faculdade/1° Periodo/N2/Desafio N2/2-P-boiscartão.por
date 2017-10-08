programa
{
	funcao inicio()
	{
		const real kl=11.00
		real soma = 0.0, peso=0.0, magro= 0.0,  gordo=0.0, quant=0.0
		inteiro  id=1, c,i=0
		
		
		escreva("\t\t\t\t\tdigite [0] para sair do programa\n")
		para(c=-1; id!=0; c++)
		{
			escreva ("informe o numero de identificação: ")
			leia (id)
				 se(id ==0)
				 {
				 	escreva ("\tfim de programa...")
				 }
				 senao
				 {		
				escreva ("informe o Peso: ")
				leia (peso)
		
					se(peso<=0.0)
					{
					escreva ("O peso tem que ser acima de [0]\n")
					}
					i++
					quant = quant + peso	
					
					se (i==1)
					{
						magro=peso
						gordo=peso
					}
					se (peso < magro)
					{
						magro = peso
					}
					se (peso> gordo)
					{
						gordo=peso
					}
					peso++
						
				}
			}
			
			soma = quant * kl
		escreva ("\nO Boi mais magro: ",magro,"\nO boi mais Gordo:", gordo,
		"\n Quantidade de bois: ",c ,"\n Qantidade total de lucro: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 144; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */