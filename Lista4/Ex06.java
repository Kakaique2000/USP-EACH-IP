class Ex06 {
	
	public static void Ponderada (double[] num, double [] peso) {
		double som1 = 0;
		double som2 = 0;
		double media = 0;

		for (int i = 0; i < num.length; i++){
			som1 += num[i] * peso[i];
		}
		for (int i = 0; i < peso.length; i++){
			som2 += peso[i];
		}
		media = som1 / som2;
		System.out.println(media);
	}

	public static void main(String[] args){
		double[] num = {1,5,8};
		double[] peso = {4,6,9};
		Ponderada(num,peso);
	}
}