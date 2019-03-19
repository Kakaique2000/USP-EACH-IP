/*
 	Programa com um IF que faz c receber 0 quando a for estritamente maior
	que 0 e estritamente menor que b. Se este não for o caso, não mude c.
*/

class Ex02 {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;

		if ((a > 0) && (a < b))
			c = 0;
		System.out.println("c vale "+c);
	}
}
