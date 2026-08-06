class Codex{
	public static void main(String[] args){
		int oddcount = 0 ;
		int evencount = 0 ;
			for(int a = 1 ; a <= 10 ;  a++){
				if( a%2 == 0){
					oddcount++;
				}else{
					evencount++ ;
				}
			}
			System.out.println("odd count :" + oddcount);
			System.out.println("even count :" + evencount);
		}

}