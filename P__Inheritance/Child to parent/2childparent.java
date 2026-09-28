class main{
	public static void main(String[] args){
		child c = new child(10,20);
		c.display();
		c.displays();
	}
}
class parent{
	int a;
	 parent(int a){
		this.a=a;
	}
	void displays(){
		System.out.println(a);
	}
	
}
class child extends parent{
		int a;
		int b;
		child(int a,int b){
			super(a);
			this.b=b;
			
		}
		void display(){
			System.out.println(b);
		}	
}

//transfer one variable child to parent and one print 
