class Student{
	int id;
	String name;
		Student(int a,String b){
			id= a;
			name=b;	
		}
		void display(){
			System.out.println("id is"+ id + "name is" + name);
		}
}

class Codex{
	public static void main(String args[]){
		Student s1 = new Student(10,"sangam");
		Student s2 = new Student(20,"harshal");
		s1.display();
		s2.display();
	}
}