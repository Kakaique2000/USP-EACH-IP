/*
	Programa converte um valor em real (em uma vaŕiável), para dólar.
*/	 

import java.util.Scanner;

class Ex06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor em real a ser convertido");
		double real = sc.nextDouble();
		double dolar = real * 0.27;

		System.out.println("O valor em dólar é "+dolar);
	}
}