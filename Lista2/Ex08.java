/*
 * 	Escreva um método que determina a data cronologicamente maior
 * 	de duas datas fornecidas como paramêtro. Cada data deve ser fornecida
 * 	por três valores inteiros onde o primeiro representa um dia, o segundo
 * 	um mês e o terceiro um ano.
*/

import java.util.Scanner;

class Ex08 {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite uma data com três valores inteiros contendo data, mês e ano.");
		int dia1 = sc.nextInt();
		int mes1 = sc.nextInt();
		int ano1 = sc.nextInt();

		System.out.println("Digite outra data");
		int dia2 = sc.nextInt();
		int mes2 = sc.nextInt();
		int ano2 = sc.nextInt();

		int data = maiorData(dia1,mes1,ano1,dia2,mes2,ano2);

		switch(data){
			case 1:
				System.out.println("A maior data é a primeira");
				break;
			case 2:
				System.out.println("A maior data é a segunda");
				break;
			case 3:
				System.out.println("As datas são iguais");
				break;
		}


	}

	static int maiorData(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
		if(ano1 == ano2)
			if(mes1 == mes2)
				if(dia1 == dia2)
					return 3;
				else if(dia1 > dia2)
					return 1;
					else return 2;
			else if (mes1 > mes2)
				return 1;
				else return 2;
		else if(ano1 > ano2)
			return 1;
			else return 2;
	}
}	


