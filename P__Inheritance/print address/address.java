class main{
	public static void main(String[] args){
		child c = new child();
		c.display();
		c.displays();
	}
}
class parent{
	int a=20;
	void displays(){
		System.out.println(this.a);
	}
}
class child extends parent{
	int a=50;
	void display(){
		System.out.println(this.a);
	}
}

//both address are same but content diffrent