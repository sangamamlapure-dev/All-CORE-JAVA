class main{
	public static void main(String[] args){
		child p = new child();
		p.fun();
	}
}
class parent{
	int a =10;
}
class child extends parent{
	void fun(){
		System.out.println(a);
	}
}
