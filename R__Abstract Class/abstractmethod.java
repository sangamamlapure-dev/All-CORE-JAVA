class Main{
	public static void main(String [] args){
		child c = new child();
		c.education();
	}	
}
class parent{
	abstract void education();
}
class child extends parent{
	void education(){
		System.out.println("B.tech");
	}
}

//abstractmethod.java:7: error: parent is not abstract and does not override abstract method education() in parent
//abstect method asel tr mang apn abstract class chalel
