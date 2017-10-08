//40. Uma locadora tem as seguintes regras para aluguel de DVDs: 
//- Às segundas, terças e quintas (2, 3 e 5) : desconto de 40% em relação ao preço normal; 
//- Às quartas , sextas, sábados e domingos (4,6 ,7 e 1): preço normal; 
//- Aluguel de DVDs comuns: preço normal; 
//- Aluguel de lançamentos: acréscimo de 15% em relação ao preço normal. 
//Desenvolver um programa para ler o preço normal do DVD alugado (em R$) e sua categoria (comum ou lançamento). 
//Calcular e imprimir o preço final que será pago pela locação do DVD. 
 

programa
{
	funcao inicio()
	{
		real va, vf
		inteiro dia, vl
		

		escreva ("Digite o valor do Aluguel: ")
		leia (va)
		escreva ("Digite o dia do Aluquel: ")
		leia (dia)
		escreva ("Digite [1] para lançamento e [2] para não lançamento: ")
		leia (vl)

		
		
		se (dia ==2 ou dia ==3 ou dia  ==5 e vl ==1 )
		
		{
		 	
		 	escreva("O Valor do aluquel será: ", va + (va * 0.4) + (va *1.5))
		}
		senao se (dia ==2 ou dia ==3 ou dia  ==5 e vl ==2 )
		
		{
		 	
		 	escreva("O Valor do aluquel será: ", va + (va * 0.4) )
		}
		
		
		senao se (dia ==4 ou dia ==6 ou dia  ==7 ou dia == 1 e vl ==1 )
		
		{
		 	
		 	escreva("O Valor do aluquel será: ", va + (va *1.5))
		}
		senao se (dia ==4 ou dia ==6 ou dia  ==7 ou dia == 1 e vl ==2 )
		
		{
		 	
		 	escreva("O Valor do aluquel será: ", va )
		}
		senao
		{
			escreva ("opção çao encontrada")
		}
		
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */