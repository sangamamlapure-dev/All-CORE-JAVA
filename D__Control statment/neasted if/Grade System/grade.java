class Codex{
	public static void main(String[] args){
	int marks =  45;
		if(marks> 0 && marks <= 100){
			if(marks >= 35 && marks < 40){
				System.out.println("pass");
			}else if(marks > 40 && marks <= 60){
				System.out.println("C grade");
			}else if(marks > 60 && marks < 80){
				System.out.println("B grade");
			}else if(marks >= 80 && marks <= 100){
				System.out.println("A grade");
			}else{
				System.out.println("Fail");
			} 
		}else{
			System.out.println("enter valid marks");	
		}
	}
}