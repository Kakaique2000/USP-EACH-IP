/*
 * 	Programa com método que, dados dois inteiros, verifica se o segundo 
 * 	é divisor do primeiro, retornando true se for e false se não.
*/

import java.util.Scanner;

class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois números inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(divisor(a,b)? "O segundo número é divisor do primeiro." : "O segundo número não é divisor do primeiro");
	}

	static boolean divisor(int a, int b) {
		return a%b == 0;
	}
}
