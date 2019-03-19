/* Dadas duas sequências, uma de n e outra de m números entre 0 e 9, interpretadas
 * como números, o método deste programa calcula a sequência de números inteiros 
 * entre 0 e 9 que representa a soma dos dois inteiros representados pela sequência.
*/

class Ex15{
	public static void main(String[] args){
		int[] a = {1,1,1,1,1,1,1};
		int[] b = {2,2,0,9,2,2};

		int c[] = soma(a,b);

		for(int e:c)
			System.out.print(e+"\t");
	}

	static int[] soma(int[] arranjo1, int[] arranjo2){
		int tamanhoSoma = arranjo1.length > arranjo2.length ? arranjo1.length +1 : arranjo2.length +1;
		int[] soma = new int[tamanhoSoma];

		int sobra = 0;
		if(arranjo1.length > arranjo2.length){
			for(int i = 1; i <= arranjo1.length; i++){
				if(arranjo2.length >= 1){
					sobra += arranjo1[arranjo1.length -i] + arranjo2[arranjo2.length - i];
					soma[tamanhoSoma - i] = sobra % 10;
					sobra /= 10;
				}
				else {
					sobra += arranjo1[arranjo1.length - 1];
					soma[tamanhoSoma - i] = sobra % 10;
					sobra /= 10;
				}
			}
		}
		else {
			for (int i = 1; i <= arranjo2.length; i++) {
				if(arranjo1.length >= 1){
					sobra += arranjo1[arranjo1.length - i] + arranjo2[arranjo2.length - i];
					soma[tamanhoSoma - i] = sobra % 10;
					sobra /= 10;
				}
				else{
					sobra += arranjo2[arranjo2.length - i];
					soma[tamanhoSoma - i] = sobra % 10;
					sobra /= 10;
				}
			}
		}
		return soma;
	}
}
