//4. Numa certa loja de eletrodomésticos, o funcionário encarregado da seção de televisores recebe, 
//mensalmente, um salário fixo mais comissão. Essa comissão é calculada em relação ao tipo e ao número de televisores vendidos 
//por mês, obedecendo à tabela a seguir:


programa
{
	funcao inicio()
	{ 
		real slfixo , lcd , plasma , stotal  , inss , callcd , calplasma , sll , ida
		escreva ("Digite o salario fixo :")
		leia (slfixo)
		escreva ("Digite a quantidade de TV LCD vendidas :")
		leia (lcd)
		escreva ("Digite a quantidade de TV de PLASMA vendidas :")
		leia (plasma)
		inss =    ( slfixo * 0.08 ) 
		escreva ("\nINSS : ",inss)
		
		

		se (lcd >= 10) {
		callcd =	50 * lcd 
		escreva ("\nlcd R$ :",callcd)
		}
		senao   {
			callcd = 5 * lcd
			escreva ("\nlcd  :",callcd)
			
		}
		se (plasma >= 20) {
			calplasma = 20 * plasma
			escreva ("\nplasma  :",calplasma)
		}
		senao {
			calplasma = 2 * plasma
			escreva ("\nplasma  :",calplasma)
		}
		stotal = slfixo + callcd + calplasma - inss
		escreva ("\nSalario total :",stotal)

		se (stotal > 500) {
		 	ida = (stotal * 0.15)	
		 	escreva ("\nimposto de renda :",ida)
		}
		senao {
			ida = 0 
		}
 		
		sll = stotal - ida
 		escreva ("\nSalario liquido é :",sll)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */