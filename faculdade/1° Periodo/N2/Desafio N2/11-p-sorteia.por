programa
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
		inteiro vet[30],num
		logico aviso=falso

		escreva("Iniciando o vetor...\n")
		para(inteiro i=0;i<30;i++){
			vet[i]=u.sorteia(1,100)
		}
		escreva("Digite um número a ser escolhido: ")
		leia(num)
		para(inteiro i=0;i<30;i++){
			se(num==vet[i]){
				escreva("Esse número existe na posição ",i)
				aviso=verdadeiro
			}
		}
		se(nao aviso){
			escreva("Esse número não existe!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 */