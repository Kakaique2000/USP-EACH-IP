/*
	Dado um arranjo de n inteiros, passado por parâmetro. escreva um método que apresente na tela todos os múltiplos de 7 contidos em tal arranjo.
*/

class Ex02{
		public static void main(String[] args){
			int[] teste = {1,2,3,4,7,14,15,21,35};
			multiplo(teste);
		}

		static void multiplo(int[] arranjo){
			for (int valor : arranjo){
				if (valor%7 == 0)
					System.out.println(valor);
			}
		}
}	