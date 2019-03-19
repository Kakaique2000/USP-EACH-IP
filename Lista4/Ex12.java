import java.util.Scanner;

class Ex12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		System.out.println("Digite o valor de n");
		int n = sc.nextInt();
		double[] a = new double[n];
		System.out.println("Digite o valor de x");
		double x = sc.nextDouble();
		System.out.println("Digite os valores de a");
		double a_zero = sc.nextDouble();
		for(int i = 0; i < n; i++){
			System.out.println("Digite os valores de a");
			a[i] = sc.nextDouble();
		}

		System.out.println(pedexis(n,x,a_zero,a));

	}

	public static double pedexis(int n, double x, double a_zero, double[] a){
		double resposta = a_zero;
		for (int i = 0; i < a.length; i++){
			resposta += a[i] * Math.pow(x, (i + 1));
			System.out.println(resposta);
		}
		return resposta;
	}
}