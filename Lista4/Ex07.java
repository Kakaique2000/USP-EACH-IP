class Ex07 {
	public static boolean Inverso(char[] num){
		boolean teste = false;
		for (int i = 0; i < num.length; i++){
			if (num[i] == num[num.length - 1 -i]){
				teste = true;
			}
			else teste = false;
		}	
		
		return teste;
		
	}	

	public static void main(String[] args){
		char[] num1 = {'o','v','o'};
		System.out.println(Inverso(num1));
	}
	
}