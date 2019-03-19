class Ex10 {
	public static boolean ordem (int[] arr){

		int controle = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if(arr[i] >= arr[i + 1])
				controle++;

		}
		if(controle + 1 == arr.length)
			return true;
		else return false;

	}

	public static void main(String[] args) {

		int[] arr = {5,4,2,3,1,0};
		System.out.println(ordem(arr));
	}
}