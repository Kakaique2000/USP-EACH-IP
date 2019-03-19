class Ex14 {

	public static void somaPolinomio(double[] px, double[] qx){
		int maiorTamanho;
		if(px.length > qx.length)
			maiorTamanho = px.length;
		else maiorTamanho = qx.length;

		double[] somaPoli = new double[maiorTamanho];
		
		if(px.length == qx.length){
			for(int i = 0; i < somaPoli.length; i++){
				somaPoli[i] = px[i] + qx[i];
				if(i == 0)
					System.out.print(somaPoli[i]);
				else System.out.print(" + "+somaPoli[i]+"*x^"+i);
			}
			System.out.println();
		}	
		if(px.length < qx.length){
			for(int i = 0; i < px.length; i++){
				somaPoli[i] = px[i] + qx[i];
				if(i == 0) System.out.print(somaPoli[i]);
				else System.out.print(" + "+somaPoli[i]+"*x^"+i);
			}
			for(int i = px.length; i < qx.length; i++){
				somaPoli[i] = qx[i];
				if(i == 0) System.out.print(somaPoli[i]);
				else System.out.print(" + "+somaPoli[i]+"*x^"+i);
			}
		}
		else{ 
			for(int i = 0; i < qx.length; i++){
				somaPoli[i] = px[i] + qx[i];
				if(i == 0) System.out.print(somaPoli[i]);
				else System.out.print(" + "+somaPoli[i]+"*x^"+i);
			}
			for(int i = qx.length; i < px.length; i++){
				somaPoli[i] = px[i];
				if(i == 0) System.out.print(somaPoli[i]);
				else System.out.print(" + "+somaPoli[i]+"*x^"+i);
			}
		}	
	}

	public static void main(String[] args){
		double[] px = {2,4,6,5,7};
		double[] qx = {};
		somaPolinomio(px, qx);

	}
}
