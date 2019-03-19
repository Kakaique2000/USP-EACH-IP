/*
 * 	Programa com método que, dados três números inteiros, fornecidos 
 * 	por parâmetro, verifique se podem ser lados de um triângulo, 
 * 	retornando true se puderem e false se não.
*/

import java.util.Scanner;

class Ex12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três números inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(triRet(a,b,c)? "Os três números podem formar um triângulo retângulo" : "Os três números não podem formar um triângulo retângulo"); 
	}
	public static boolean triRet(int a, int b, int c) {
		int hip = 0;
		int cat1 = 0;
		int cat2 = 0;

		if(a > b && a > c){
			hip = a;
			cat1 = b;
			cat2 = c;
		}
		if(b > a && b > c){
			hip = b;
			cat1 = a;
			cat2 = c;
		}	
		if(c > a && c > b){
			hip = c;
			cat1 = a;
			cat2 = b;
		}
		return Math.pow(hip, 2) == Math.pow(cat1, 2) + Math.pow(cat2, 2);
	}
}
