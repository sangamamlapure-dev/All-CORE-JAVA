class Main{
	public static void main(String [] args){
		child c = new child();
		c.education();
	}	
}
 abstract class parent{
	abstract void education();
}
class child extends parent{
	void education(){
		System.out.println("B.tech");
	}
}

//manje jenva aplyala abstract method pahije tenva class pn abstract pahije