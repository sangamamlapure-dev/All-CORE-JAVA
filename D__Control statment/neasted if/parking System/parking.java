class Codegurucool{
	public static void main(String[] args){
		boolean vip = false ; 
		int hours = 9;
			if(vip == true){
				System.out.println("charge = 0");
			}else{
				if(hours <= 2){
					System.out.println(hours* 20);
				}else{
					System.out.println(40 + (hours-2)*10);
				}
			}
	}
}