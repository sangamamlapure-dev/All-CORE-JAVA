class main{
	public static void main(String[] args){
		student student1=new student();
			student1.name="sangam";
			student1.id=2010;
			student1.display();
		
		student student2=new student();
			student2.name="karan";
			student2.id=504;
			student2.display();

	}
}

class student{
	String name;
	int id;
		void display(){
			System.out.println(name);
			System.out.println(id);	
		}
}