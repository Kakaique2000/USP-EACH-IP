/*
 	Esse programa recebe um número inteiro de 3 digitos como parâmetro
       	e retorna e imprime seu	inverso na tela.
*/

import java.util.Scanner;

class Ex10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro de 3 digitos");
		int num = sc.nextInt();
		
		if (num < 100)
			System.out.println("Número inválido");
		else inversor(num);
	}	
	
	static void inversor(int num){
		int unidade = num % 10;
		int dezena = (num % 100)/10;
		int centena = num / 100;

		System.out.println(unidade+""+dezena+""+centena);
	}
}	
