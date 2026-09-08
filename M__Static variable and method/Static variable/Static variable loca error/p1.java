class Codex{
	void fun(){
		static int a=10;
		System.out.println(a);
	}
}
class main(){
	Codex c1= new Codex();
	c1.fun();	
}