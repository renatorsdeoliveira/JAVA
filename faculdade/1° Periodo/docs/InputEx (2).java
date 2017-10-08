package br.com.introducao;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		int nIdent;
		double n1, n2, n3, MA, media;
		char conceito;
		String continuar;

		do {
			System.out.println("Informe o numero de identificação: ");
			nIdent = leitura.nextInt();

			do {
				System.out.println(nIdent + ", Informe a nota N1: ");
				n1 = leitura.nextDouble();
				if (n1 < 0 || n1 > 10)
					System.out.println("N1 inválida, tente novamente.");
			} while (n1 < 0 || n1 > 10);

			do {
				System.out.println(nIdent + ", Informe a nota N2: ");
				n2 = leitura.nextDouble();
				if (n2 < 0 || n2 > 10)
					System.out.println("N2 inválida, tente novamente.");
			} while (n2 < 0 || n2 > 10);

			do {
				System.out.println(nIdent + ", Informe a nota N3: ");
				n3 = leitura.nextDouble();
				if (n3 < 0 || n3 > 10)
					System.out.println("N1 inválida, tente novamente.");
			} while (n3 < 0 || n3 > 10);

			System.out.println(nIdent + ", Informe a média de atividades: ");
			MA = leitura.nextDouble();
			while (MA < 0 || MA > 10) {
				System.out.println(nIdent + ", MA informado inválido, tente novamente: ");
				MA = leitura.nextDouble();

			}

			media = (n1 + n2 * 2 + n3 * 3 + MA) / 7;

			if (media >= 9) {
				conceito = 'A';
			} else if (media >= 7.5 && media < 9) {
				conceito = 'B';
			} else if (media >= 6 && media < 7.5) {
				conceito = 'C';
			} else if (media >= 4 && media < 6) {
				conceito = 'D';
			} else {
				conceito = 'E';
			}

			System.out.printf("\nO aluno de identificação %d" + " obteve média %.2f por isso seu conceito foi: %c",
					nIdent, media, conceito);

			System.out.print("\nPortanto o Aluno está ");

			switch (conceito) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("APROVADO!");
				break;
			case 'D':
			case 'E':
				System.out.println("REPROVADO");
				break;
			default:
				System.out.println("Conceito inválido.");
			}
	
			do {
				System.out.println("\nDeseja continuar? (sim/nao): ");
				continuar = leitura.nextLine();
				if (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("nao"))
					System.out.println("Digite apenas sim ou nao! Tente novamente.");
			} while (!continuar.equalsIgnoreCase("sim") && !continuar.equalsIgnoreCase("nao"));

		} while (continuar.equalsIgnoreCase("sim"));

	}

}
