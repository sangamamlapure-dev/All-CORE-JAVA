class Codex{
	void fun(){
		System.out.println("class Codex in fun");
	}
	void fun(int a){
		System.out.println("class Codex in fun"+a);
	}
}

Class Main{
	public static void main(String[] args){
		Codex c= new Codex();
		c.fun();
		c.fun(10);
	}
}

//two method same chaltay pn main manje parameter pahije ani tyala apn signature manto ani te diffrent pahije tenva he chaltay 


