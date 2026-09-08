class Main{
	public static void main(String args[]){
		Codex obj = new Codex();
		obj.fun();
		obj.gun();
		Codex obj1 = new Codex();
		obj1.fun();
		obj2.fun();		
	}
}
class Codex{
	int a=10;
	
	static void fun(){
		System.out.println(a);
	}
	void gun(){
		System.out.println(a);
	}
}