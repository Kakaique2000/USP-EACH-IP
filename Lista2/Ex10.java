/*
 * 	Programa com método que recebe como parâmetro a velocidade do vento
 * 	aferida dirante uma tempestade e retorna a classificação do furacão,
 * 	caso a tempestade possa ser classificada como tal.
*/

import java.util.Scanner;

class Ex10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a velocidade dos ventos em Km/H");
		double velocidade = sc.nextDouble();

		furacao(velocidade);
	}

	static void furacao(double velocidade){
		if(velocidade < 62){
			System.out.println("É só uma brisa");
		}	
		if(velocidade >= 62 && velocidade <= 118){
			System.out.println("É uma tempestade tropical");
		}
		if(velocidade >=119 && velocidade <= 153){
			System.out.println("É um furacão de categoria 1");
		}
		if(velocidade >= 154 && velocidade <= 177){
			System.out.println("É um furacão de categoria 2");
		}
		if(velocidade >= 178 && velocidade <= 209){
			System.out.println("É um furacão de categoria 3");
		}
		if(velocidade >= 210 && velocidade <= 249){
			System.out.println("É um furacão de categoria 4");
		}
		if(velocidade > 249){
			System.out.println("É um furacão de categoria 5");
		}
	}
}
