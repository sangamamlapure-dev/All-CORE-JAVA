class Main{
	public static void main(String [] args){
		child c = new child();
		c.education();
	}	
}
class parent{
	void education();
}
class child extends parent{
	void education(){
		System.out.println("B.tech");
	}
}

//method.java:8: error: missing method body, or declare abstract
        void education();
      
