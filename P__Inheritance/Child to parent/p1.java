class main{
	public static void main(String[] args){
		child c = new child(10);
		c.display();
	}
}
class parent{
	int a;
	 parent(int a){
		this.a=a;
	}
	void display(){
		System.out.println(a);
	}
	
}
class child extends parent{
		int a;
		child(int a){
			super(a);
			
		}	
}

//both address are same but content diffrent