/* Exercício 17 da Lista 4 - Escreva um método que receba um arranjo de tamanho N, 
 * como parâmetro e o inverta. Não use um arranjo auxiliar para guardar o arranjo 
 * invertido. O objetivo é modificar o próprio arranjo dado como parâmetro, ou seja, 
 * se o arranjo passado continha 1,2,3, após o fim da função ele terá 3,2,1.
*/

import java.util.Scanner;

class Ex17 {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do Array");
		int n = sc.nextInt();

		int[] array = new int[n];

		for(int i = 0; i < array.length; i++){
			System.out.println("Digite um número inteiro para inserir no array");
			array[i] = sc.nextInt();
		}

		inverteArray(array);

		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}

	}

	static void inverteArray (int[] array){
		int aux;

		for(int i = 0; i < array.length/2; i++){
			aux = array[i];
			array[i] = array[array.length -i -1];
			array[array.length -i -1] = aux;
		}
	}
}
