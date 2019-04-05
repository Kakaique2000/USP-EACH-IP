/* Escrever métodos que recebam uma matriz de N x M inteiros como parâmetro e:
 * 	
 * 	a) Determine o maior valor nela contido.
 * 	b) Retorne a posição da matriz em que se encontra a primeira ocorrência do valor 
 * 	   máximo (na forma de um arranjo em que a posição 0 corresponde à linha de 1 à 
 * 	   coluna)
*/

class Ex01 {
	public static void main(String[] args){
		int[][] arr = {{1,2,9,4},{4,3,2},{3,5,2,1}};
		int [] pos = posMaiorValor(arr);

		int maiorArray = maiorValor(arr);	
		System.out.println("O maior valor do array é "+maiorArray);
		System.out.println("A posição do maior valor é "+pos[0]+" e "+pos[1]);

	}

	static int maiorValor (int[][] arr){
		int maiorValor = arr[0][0];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] > maiorValor){
					maiorValor = arr[i][j];
				}
			}	
		
		}

		return maiorValor;
	}

	static int[] posMaiorValor(int[][] arr){
		int maiorValor = arr[0][0];
		int[] posMaiorValor = {0,0};

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j< arr.length; j++){
				if(arr[i][j] > maiorValor){
					maiorValor = arr[i][j];
					posMaiorValor[0] = i;
					posMaiorValor[1] = j;
				}
			}
		}

		return posMaiorValor;
	}
}
