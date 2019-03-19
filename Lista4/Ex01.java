/*
	Escreva um método que determine o valor do maior elemento de um arranjo de floats dado como parâmetro.
*/

class Ex01{
		public static void main(String[] args){
			float[] teste = {1.0f,2.0f,3.0f,1.5f,2.2f,10.0f,12.2f,28.8f};
			System.out.println(maiorValor(teste));
		}

		static float maiorValor(float[] teste){
			float maior = 0;
			for (float valor : teste){
				System.out.println(valor);
				if (valor > maior)
					maior = valor;	
			}
			return maior;
		}
}	