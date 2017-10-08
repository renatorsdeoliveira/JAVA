programa
{
	funcao inicio()
	{
	cadeia nomemarido, nomeesposa
	inteiro sub,anocasal, anoatual
	
	escreva ("Digite o nome do marido:" )
	leia (nomemarido)
	escreva ("Digite o nome da esposa:" )
	leia (nomeesposa)

	escreva ("coloque o ano de casameto:" )
	leia (anocasal)
	escreva ("coloque o ano atual")
	leia (anoatual)

	sub = anoatual - anocasal

	escreva ("O casal: ", nomemarido," e ", nomeesposa," estão casados ha:", anoatual -anocasal,"\n")

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 453; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */