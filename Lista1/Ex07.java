/*
	Esse método recebe como parâmetro uma certa altura e retorna o tempo de queda
	livre de um objeto.
*/

import java.util.Scanner; 	

class Ex07 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a altura da queda ?");
		double h = sc.nextDouble();

		double t = Math.sqrt(h/5);

		System.out.println("O tempo de queda é "+t+" segundos");

	} 
}