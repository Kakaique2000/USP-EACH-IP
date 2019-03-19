/* 
	Programa calcula o valor da multa para os jogadores do campeonato brasileiro que
	receveram cartões amarelos e vermelhos.
*/	

import java.util.Scanner;

class Ex09 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número do time");
		int time = sc.nextInt();
		System.out.println("Digite o número do jogador");
		int jogador = sc.nextInt();
		System.out.println("Digite a quantidade de cartões amarelos recebidos pelo jogador");
		int amarelos = sc.nextInt();
		System.out.println("Digite a quantidade de cartões vermelhos recebidos pelo jogador");
		int vermelhos = sc.nextInt();

		double multaAmar = amarelos * 1000.20; // Valor da multa por cartão amarelo.
		double multaVerm = vermelhos * 4523.75; // Valor da multa por cartão vermelho.
		double total = multaAmar + multaVerm;

		System.out.println("O jogador "+jogador+" do time "+time+" pagará uma multa de "+total);
	}
}