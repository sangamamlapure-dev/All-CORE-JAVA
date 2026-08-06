class Codex{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7};
		int odd = 0 ;
		int even = 0 ;
			for(int i=0; i<= a.length-1; i++){
				if(a[i]%2 ==0){
					even++ ;
				}else{
					odd++;
				}
			}
				System.out.println("even count");
					System.out.println(even);
				System.out.println("odd count");
					System.out.println(odd);
	}
}