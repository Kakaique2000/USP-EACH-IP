/*
	Calcula o valor a ser pago por um aluno de uma academia de ginástica,
	sabendo-se que ele terá desconto de 7% se pagar antecipado.
*/

import java.util.Scanner;

class Ex04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a opção de pagamento:\n1.\tÀ vista\n2.\tParcelado");
		int opcao = sc.nextInt();
	
		System.out.println("Digite o valor da Hora/Aula");
		double valorAula = sc.nextDouble();

		System.out.println("Digite a quantidade de aulas a ser cobrada");
		int numAulas = sc.nextInt();

		double valor = calculo_academia(opcao, valorAula, numAulas);	

		System.out.println(valor > 0 ? "O valor total é: R$"+valor : "Erro! Você digitou algum valor inválido");

	}

	static double calculo_academia(int opcao, double valorAula, int numAulas){
		if(numAulas < 0 || valorAula < 0)
			return -1;

		switch(opcao){
			case 1: return valorAula*numAulas*0.93;
			case 2: return valorAula*numAulas;
			default: return -1;
		}
	}
}
