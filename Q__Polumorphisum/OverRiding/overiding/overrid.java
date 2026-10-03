class Main{
	public static void main(String [] args){
		child c = new child();
		c.education();
	}
}

class parent{
	void education(){
		System.out.println("B.Pharma");
	}
}
class child extends parent{
	void education(){
		System.out.println("B.tech");
	}	
}
