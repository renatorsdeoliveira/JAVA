//38. Faça um algoritmo que receba o salário e um código correspondente ao cargo de um funcionário e imprima seu cargo,
//o salário, o percentual de aumento ao qual este 
//funcionário tem direito segundo a tabela a seguir e o valor do aumento baseado no salário:
programa
{	
	funcao tabela()
	{
	escreva("\t\t      CODIGO    \t\t   CARGO      \t\t  PERCENTUAL \n")	
	escreva("\t\t        1       \t\t  escrito     \t\t    50%      \n")
	escreva("\t\t        2       \t\t  secretaria  \t\t    35%      \n")
	escreva("\t\t        3       \t\t  Caixa       \t\t    20%      \n")
	escreva("\t\t        4       \t\t  Gerente     \t\t    10%      \n")	
	escreva("\t\t        5       \t\t  diretor     \t\t     0%      \n")	
	}
	funcao inicio()
	{
	cadeia c
	inteiro cd 
	real sl, sf
	

	escreva("Digite o seu salario $: ")
	leia(sl)
	limpa()
	tabela()
	escreva("Digite o Codigo referente a tabela: " )
	leia(cd)
	
		escolha (cd)
		{
			caso 1:
				
				sf = sl + (sl * 0.5)
				escreva ("Seu Cargo: 'Escritorio' e seu salario final e : ",sf)
				
				pare
			caso 2:
				sf = sl + (sl * 0.35)
				escreva ("Seu Cargo: 'Scretaria' e seu salario final e : ",sf)
				pare
			caso 3:
				sf = sl + (sl * 0.2)
				escreva ("Seu Cargo: 'Caixa' e seu salario final e : ",sf)
				pare
			caso 4:
				sf = sl + (sl * 0.1)
				escreva ("Seu Cargo: 'Gerente' e seu salario final e : ",sf)
				pare
			caso 5:
				sf = sl 
				escreva ("Seu Cargo: 'Diretor' e seu salario final e : ",sf)
				pare
			caso contrario:
				escreva("Opção não encontrada")
		}
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */