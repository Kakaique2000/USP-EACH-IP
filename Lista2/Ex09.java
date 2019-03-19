/*
 * 	Método que converte comprimentos em milhas, jardas, pés e polegadas
 * 	em quilômetros.
*/

import java.util.Scanner;

class Ex09{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String unidade = "";

		System.out.println("Qual unidade você deseja converter para quilômetros?\n1.\tMilhas\n2.\tJardas\n3.\tPés\n4.\tPolegadas");
		int opcao = sc.nextInt();

		System.out.println("Digite o valor a ser convertido");
		double valor = sc.nextDouble();

		switch (opcao){
			case 1:
				unidade = "Milhas";
				break;
			case 2:
				unidade = "Jardas";
				break;
			case 3:
				unidade = "Pés";
				break;
			case 4:
				unidade = "Polegadas";
				break;
			default:
				valor = -1;
		}

		double resposta = conversor(opcao, valor);

		System.out.println(valor>0? "Esse valor de "+unidade+" corresponde a "+resposta+" quilômetros.": "Erro! Algum valor inserido é inválido");

	}

	static double conversor(int opcao, double valor){
		/* Esse método recebe a unidade e ser convertida e o valor 
		 * escolhido e converte para quilômetros. Caso o valor seja
		 * negativo retorna -1 como erro.
		*/

		if(valor < 0)
			return -1;

		switch(opcao){
			case 1:
				return valor*1.60934;
			case 2:
				return valor*0.0009144;
			case 3:
				return valor*0.0003048;
			case 4:
				return valor*0.0000254;
			default:
				return -1;
		}
	}
}

