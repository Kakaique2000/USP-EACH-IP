/*
 * 	Programa com método que, dados três valores inteiros diferentes entre si,
 * 	apresente o maior de tais valores.
*/

import java.util.Scanner;

class Ex06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três números inteiros diferentes entre si");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int resultado = maiorValor(a, b, c);

		System.out.println("O maior número é "+resultado);
	}

	static int maiorValor (int a, int b, int c){

		if (a<b && a<c){
			if (b<c)
				return c;
			else return b;
		}
		else return a;
	}	
}
