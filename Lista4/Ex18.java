/* Exercício 18 - Lista 4 -> Escreva um método que, dado um arranjo de int passado como
 * parâmetro, retorne a posição do maior elemento desse arranjo. Como o arranjo pode 
 * conter números duplicados, se o maior for duplicado seu método deve retornar a posição
 * do primeiro deles.
*/

class Ex18 {
	public static void main(String[] args){
		int[] arr = {1,5,3,4,5};

		int resultado = maiorNumeroArranjo(arr);

		System.out.println("A posição do maior número no arranjo é "+resultado);
	}

	static int maiorNumeroArranjo(int[] arr){
		int aux = arr[0];
		int pos = 0;
		for(int i = 0; i < arr.length; i++){
			if (aux < arr[i]){
				aux = arr[i];
				pos = i;
			}
		}
		return pos;
	}
}
