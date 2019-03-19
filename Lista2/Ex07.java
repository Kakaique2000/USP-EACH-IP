/*
 * 	Escreva um método que converta uma temperatura expressa em graus 
 * 	Celsius em seu valor equivalente em graus Fahrenheit (C = 5/9*(F-32))
 * 	ou vice-versa de acordo com a opção de conversão escolhida em um 
 * 	de seus parâmetros.
*/

import java.util.Scanner;

class Ex07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String unidade;

		System.out.println("Digite para qual unidade você deseja converter:\n1.\tCelsius-Fahrenheit\n2.\tFahrenheit-Celsius");
		int opcao = sc.nextInt();

		System.out.println("Digite o valor a ser convertido");
		double valor = sc.nextDouble();

		if(opcao == 1)
			unidade = "Fahrenheit";
		else unidade = "Celsius";

		double resposta = conversor (opcao, valor);

		System.out.println(resposta > 0 ? "O valor em "+unidade+" é "+resposta : "Erro! Unidade de conversão escolhida é inválida");

	}

	static double conversor(int opcao, double valor){

		switch(opcao){
			case 1:
				return (valor * 1.8) + 32;
			case 2:
				return (valor - 32) / 1.8;
			default:
				return -1;
		}
	}
}	
