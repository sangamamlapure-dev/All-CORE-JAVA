class Codex{
	public static void main(String[] args){
		codex cg=new codex();
			cg.fun();
		codex cg1=new codex();
			cg1.a=20;	
			cg1.fun();	
	}
}
class codex{
	int a=10;
		void fun(){
			System.out.println(a);
		}
}