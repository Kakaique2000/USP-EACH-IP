/*
	Esse programa recebe os coeficientes de uma equação de segundo grau e retorna
	as raízes, escrevendo a resposta na tela.
*/

import java.util.Scanner;	

class Ex08 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os coeficientes da equação, começando por a até c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		double delta = Math.pow(b, 2) - (4 * a * c);
		double raiz1 = (- b + Math.sqrt(delta)) / (2 * a);
		double raiz2 = (- b - Math.sqrt(delta)) / (2 * a);

		System.out.println("As raízes da equação são "+raiz1+" e "+raiz2);
	}
}