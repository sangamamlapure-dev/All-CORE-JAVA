class Codex{
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7};
		int odd = 0 ;
		int even = 0 ;
			for(int i=0; i<= a.length-1; i++){
				if(a[i]%2 ==0){
					even = even+a[i] ;
				}else{
					odd = odd+a[i];
				}
			}
				System.out.println("sum of even");
					System.out.println(even);
				System.out.println("sum of odd");
					System.out.println(odd);
	}
}