/* Este programa contém um método que dado como parâmetro três números inteiros a, b e c retorne a posição do maior 
 * e a posição do menor valor (em um arranjo).
*/
 
import java.util.Scanner;

class Ex16 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] array = {a,b,c};

		int[] teste = maiorMenorArray(array);

		System.out.println("Maior: "+teste[0]+"\nMenor: "+teste[1]);

	}

	static int[] maiorMenorArray(int[] array){
		int[] saida = {0,0};
		
		int menorValor = array[0];
		int maiorValor = 0;

		for(int i = 0; i < array.length; i++){
			if (array[i] > maiorValor){
				saida[0] = i;
				maiorValor = array[i];
			}
			else if (array[i] < menorValor){
				saida[1] = i;
				menorValor = array[i];
			}
		}

		return saida;
	}
}
