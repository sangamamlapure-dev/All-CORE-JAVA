class Codex{
	public static void main(String[] args){
		int count = 1;
		int sum = 1 ;
			for(int i = 1; i <= 4 ; i++){
				for(int j = 1 ; j <= i ; j++){
					System.out.print(sum +" ");
					count+=2 ;
					sum = sum + count ;
				}
					System.out.println();
			}
	}
}