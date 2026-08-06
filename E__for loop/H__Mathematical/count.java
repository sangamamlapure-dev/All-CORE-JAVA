class Codex{
	public static void main(String[] args){
		int num = 412522 ;
		int count = 0 ;
			for(int i = num ; i> 0; i=i/10){
				count++; 
			}
		System.out.println(count);
	}
}