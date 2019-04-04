/* Escreva um método que dado um arranjo de int passado como parâmetro, retorne a posição 
 * do maior elemento deste arranjo. Como o arranjo pode conter números duplicado, se o maior 
 * for duplicado seu método deve retornar a posição do último deles.
*/

class Ex19 {
	public static void main(String[] args){
		int[] arr = {1,4,7,5,6,7,5};

		int resultado = maiorNumeroArranjo(arr);

		System.out.println("A posição do maior número do arranjo é "+resultado);
	}

	static int maiorNumeroArranjo (int[] arr){
		int aux = arr[0];
		int pos = 0;

		for(int i = 0; i < arr.length; i++){
			if(aux < arr[i]){
				aux = arr[i];
				pos = i;
			}
			if(aux == arr[i]){
				pos = i;
			}
		}

		return pos;
	}
}
