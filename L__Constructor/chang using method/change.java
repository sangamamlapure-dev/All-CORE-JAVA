class Student{
	private int age;
	private String name;
		Student(int age, String name){
			this.name=name;
			this.age=age;
		}
		void setage(int setage){
			 setage= age;
		}
		void display(){
			System.out.println(name);
			System.out.println(age);
		}
}
class Codex{
	public static void main(String args[]){
		Student s1 = new Student(10,"sangam");
		s1.setage(20);
		s1.display();
	}
}
