class Codex{
	public static void main(String[] args){
		int marks = 50;
			if(marks >= 0 && marks <= 100){
				if(marks <= 35){
					System.out.println("fail");
				}else if(marks > 35 && marks <= 60){
					System.out.println("Grade C");
				}else if(marks > 60 && marks <= 70){
					System.out.println("Grade B");
				}else if(marks > 70 && marks <= 100){
					System.out.println("Grade A");
				}else{
					System.out.println("pass");
				}
				
			}else{
				System.out.println("enter valid marks");
			}
	}
}