class Codex{
	public static void main(String[] args){
		int order = 400 ;
		boolean premium = false;
		if(premium == false){
			if(order >= 500){
				System.out.println("free delivary");
			}else{
				System.out.println("charges = 50");
			}
		}else{
			System.out.println("free delivery");
		}
	}
}