class Codex{
	int a=10;
	int b;
	Codex(int b){
		this.b=a;
	}
	void Display(){
		System.out.println(b);	
	}
	

}
class Demo{
	public static void main(String[] args){
		Codex c1=new Codex(10);
		c1.Display();		
	}
}