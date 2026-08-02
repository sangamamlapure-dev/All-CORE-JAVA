class Codex{
	public static void main(String[] args){
		int balance = 5000 ;
		int withrow = 6000;
		     if(withrow > 0){
			if(withrow <= 5000){
				if(withrow % 100 == 0){
					System.out.println("success");
				}else{
					System.out.println("enter multiple by 100 like 100 ,200 ,500");
				}
		}else{
			System.out.println("your account has no money");
		}
	 
	    }else{
			System.out.println("enter valid amount");
		}
}
}