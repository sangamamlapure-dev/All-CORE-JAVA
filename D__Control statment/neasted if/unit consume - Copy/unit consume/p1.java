class Codex{
	public static void main(String[] args){
		int unit = 300 ; 
		if(unit <= 100){
			System.out.println(unit * 5);
		}else if(unit <= 200){
			System.out.println(100*5 +(unit-100)*7);
		}else{
			System.out.println(500 + 700 + (unit- 200)*10);
		}
	}	
}