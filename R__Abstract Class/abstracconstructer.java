class Main{
	public static void main(String [] args){
		child c = new child();
		c.education();
	}	
}
 abstract class parent{
	abstract void education();
	parent(){
		System.out.println("in cons");
	}
}
class child extends parent{
	void education(){
		
	}
}

//abstract class madhe constructer chalat nahi direct pn child through apn super ne karu shto