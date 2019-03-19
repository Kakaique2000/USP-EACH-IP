/* 
 	Programa escreve "fora" quando a variável for menor que 4 ou 
	maior que 10.

*/

import java.util.Scanner;

class Ex03 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da variável");
		int var = sc.nextInt();

		if(var < 4 || var > 10)
			System.out.println("Fora!!");
		else System.out.println("Dentro!!");
	}
}
