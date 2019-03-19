/*
 * 	Numa loja de eletrodomésticos, as compras têm um preço à vista, ou 
 * 	acréscimo de 10% para pagamentos em 2 vezes, ou então de 20% para 
 * 	pagamentos em 3 vezes.
*/

import java.util.Scanner;

class Ex05 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da compra");
		double valor = sc.nextDouble();

		System.out.println("Digite a opção de pagamento\n1.\tÀ vista\n2.\tDuas vezes\n3.\tTrês vezes");
		int opcao = sc.nextInt();

		double valorFinal = valorCompra(opcao, valor);

		System.out.println(valorFinal > 0 ? "O valor da compra é "+valorFinal : "Erro! Valores inseridos são inválidos");
	}

	static double valorCompra(int opcao, double valor){
	//Método recebe valor da compra e a opção de compra e retorna o valor final.

		if(valor < 0)
			return -1;

		switch(opcao){
		case 1:
			return valor;
		case 2:
			return (valor*1.2);
		case 3:
			return (valor*1.3);
		default:
			return -1;
		}
	}
}	
