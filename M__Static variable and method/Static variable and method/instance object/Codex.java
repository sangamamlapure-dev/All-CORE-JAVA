class Codex{
	int a=10;
	int b=20;
	static void fun(){
		System.out.println(a);
	}
	
	void gun(){
		System.out.println(b);
	}
}
class main{
public static void main(String args[]){
		Codex.fun();
		Codex.gun();
		Codex c1=new Codex();
		c1.fun();
		c2.gun();	
	}
}