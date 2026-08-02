class Demo{
	public static void main(String[] args){
		int age = 18 ;
		boolean voterid = false;
			if(age >= 18){
				if(voterid == true){
					System.out.println("you can vote");
				}else{
					System.out.println("not eligible for vote");
				}
			}else{
				System.out.println("under age ");	
			}
		}
	}