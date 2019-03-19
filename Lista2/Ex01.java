/*
 	Programa para testar várias condicionais e entender como elas 
	funcionam.
*/

class Ex01 {
	public static void main(String[] args){
		alfa();
		beta();
		gama();
		delta();
		epsilon();
		zeta();
	}

	static void alfa(){
		if (5 < 5) System.out.println("sim");
		System.out.println("é a resposta. \n");
	}

	static void beta(){
		int var1 = 3;
		int var2 = 6;
		if ((var1 + 2) < var2) System.out.println("oba");
		if ((var1 + 4) < var2) System.out.println("abo");
		if ((var1 + 4) > var2) System.out.println("aob");
		System.out.println("ola\n");
	}

	static void gama(){
		int a = 10;
		int b = 20;
		int c;
		if (a < b) c = a;
		else c = b;
		System.out.println(a+" "+b+" "+c);
	}

	static void delta(){
		int a = 10;
		int b = 20;
		int c = (a < b) ? a : b;
		System.out.println(a+" "+b+" "+c);
	}

	static void epsilon(){
		int a = 3;
		int b = 4;
		boolean continua = true && ((a + b) < (2 * a));
		if (continua) System.out.println("alto");
		else System.out.println("baixo");
	}

	static void zeta(){
		int a = 5;
		int b = 3;
		int c = 9;
		int aux;

		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (b > c){
			aux = b;
			b = c;
			c = aux;
		}
		if (a > b){
			aux = a;
			a = b;
			b = aux;
		}
		System.out.println(c+" "+b+" "+a);
	}

}
