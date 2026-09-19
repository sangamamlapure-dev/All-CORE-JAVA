class Collage{
	int a=10;
	
	void fun(){
		System.out.println("in collage");
	}
}
class Demo{
	public static void main(string args[]){
		collage c =null;
		c=new Collage();
		c.fun();
	}
}