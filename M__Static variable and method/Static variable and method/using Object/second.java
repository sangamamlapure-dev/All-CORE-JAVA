class Codex{
	static int age=20;
	static void display(){
		System.out.println(age);
	}
}
class main{
public static void main(String args[]){
	Codex var = new Codex();
		System.out.println(var.age);	
	Codex meth=new Codex();
		meth.display();			
	}
}