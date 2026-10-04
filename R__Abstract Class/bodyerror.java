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
		
	}
}

//manje jenva aplyala abstract method pahije tenva class pn abstract pahije ani child la body compalasory dyavi lagte nahi tr tya class ani method la abstract karav lagel