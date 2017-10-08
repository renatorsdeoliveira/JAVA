programa
{
	funcao inicio()
	{
		inteiro num[10],x,y,menor,maior

		para(inteiro i=0;i<10;i++){
			escreva("Digite um número: ")
			leia(num[i])
			se(i==0){
				x=num[i]
				y=num[i]
				menor=i
				maior=i
			}
			senao se(num[i]<x){
				x=num[i]
				menor=i
			}
			senao se(num[i]>y){
				y=num[i]
				maior=i
			}
		}
		escreva("O menor elemento Numero é: ",x," e sua posição no vetor é: ",menor)
		escreva("\nO maior elemento Numero é: ",y," e sua posição no vetor é: ",maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */