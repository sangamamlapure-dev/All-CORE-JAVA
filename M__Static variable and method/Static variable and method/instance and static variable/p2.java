class Codex{
	int a;
	static int b =20;

	Codex(int a){
		this.a=a;	
	}
	void fun(){
		System.out.println(this.b);
	}
	static void gun(){
		System.out.println(b);	
	}
}
class Demo{
	public static void main(){
		Codex c1=new Codex(10);
			c1.fun();
			c1.gun();
		Codex c2=new Codex(30);
			c2.fun();
			c2.gun();

	}
}