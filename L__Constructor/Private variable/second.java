class Student{
	private int age=21;;
	private String name="sangam";
		Student(int age, String name){
			this.name=name;
			this.age=age;
		}
}
class Codex{
	public static void main(String args[]){
		Student s1 = new Student(10,"sangam");
		s1.age=20;
	}
}
