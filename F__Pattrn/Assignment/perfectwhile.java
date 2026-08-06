class Codex{
	public static void main(String[] args){
		int i = 1 ;
		int count = 0 ;
		int num = 6 ;
			while(i < 6){
				if(num % i == 0){
					count = count + 1 ;
				}
					
				System.out.println(count);
			}
				if(count == num){
					System.out.println("perfect");
				}else{
				System.out.println(" not perfect");	
				}
	}
}