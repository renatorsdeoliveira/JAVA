//7. Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário. 
//? Dados de Entrada: Matrícula do Funcionário (inteiro);      Quantidade de horas-extras trabalhadas; 
//? Constantes: Salário Mínimo = R$ 788.00;         Valor da Hora-extra = R$ 15.00 / hora 
 
//Sabe-se: ? Salário hora-extra = horas-extras * valor da Hora-Extra; ? Salário Bruto = 3 
//* Salário Mínimo + Salario Hora-Extra; 
//? Desconto INSS = 12% do salário bruto, se o salário bruto for maior que R$1500,00; 
//? Desconto do Imposto de Renda = 22% do salário bruto, se o mesmo for maior que R$ 2000,00; 
//? Salário Líquido = Salário bruto ? deduções; 
 
//Obs. Para declarar constantes em seu programa, basta usar o comando dentro das chaves de função 
//?const tipoDeDados nomeConstante = valorDaConstante?.            Ex. const real pi 3.14159 
 

programa
{
	funcao inicio()
	{
		inteiro matricula, qdhoras
		real sllig, slbruto, slhoraex, descins, dimpo 
		const real slmin = 788.00, horaex = 15.00

		descins = 0.0 
		dimpo = 0.0

		escreva ("Digite sua Matricula: ")
		leia (matricula)
		escreva ("Digite quantidade de horas Extra: ")
		leia (qdhoras)

		slhoraex = qdhoras * horaex
		slbruto = 3 * slmin + slhoraex

		se (slbruto > 1500 e slbruto <2000)
		{
			escreva ("Seu Salario com Desconto INSS é: ", descins = 0.12 * slbruto)
		}
		senao se (slbruto > 2000 )
		{
			escreva ("Seu Salario com Desconto do Imposto de Renda é: ", dimpo = 0.22 * slbruto)
		}
		senao
		{
			sllig = slbruto - descins - dimpo
			escreva ("o Salario Liquido é: ", sllig)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 858; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */