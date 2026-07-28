class Demo {
	public static void main(String[] args){
	char a = 65;
	System.out.println(a);
	Demo.fun();
	Codex chavi = new Codex();
	chavi.fun();
	}
	
	static void fun(){
	char a= 65535 ;
	System.out.println(a);
	}

}
 class Codex{
	 void fun(){
	 char a = 65536 ;
	 System.out.println(a);
	}
}

//char range is 0 to 65535
//when you put 65536 tr te char madhe basat nahi