class Ex11 {

	public static int[] ocorrencia (int[] resultados){
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;

		for (int i = 0; i < resultados.length; i++){
			switch(resultados[i]){
				case 1:
					um++;
					break;
				case 2:
					dois++;
					break;
				case 3:
					tres++;
					break;
				case 4:
					quatro++;
					break;
				case 5:
					cinco++;
					break;
				case 6:
					seis++;
					break;	
				default:
					break;					
			}
		}
		int[] dado = {um, dois, tres, quatro, cinco, seis};
		return dado;
	}

	public static void main(String[] args) {
		int[] resultados = {1,2,3};
		ocorrencia(resultados);
		for(int i = 0; i < ocorrencia(resultados).length; i++){
			System.out.print(ocorrencia(resultados)[i]+" ");
		}
		System.out.println();
	}
}