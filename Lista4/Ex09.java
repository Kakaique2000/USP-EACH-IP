class Ex09 {
	public static void indPar(double[] num){
		double a = 0;
		double b = 0;
		for(int i = 0; i < num.length / 2; i++){
			a = num[i];
			b = num[num.length - i - 1];
			num[i] = b;
			num[num.length -i -1] = a;
		}
		for(double c : num)
			System.out.println(c+ " ");
	}

	public static void main(String[] args) {
		double[] num = {1,2,3,4,5,6};
		indPar(num);
	}
}