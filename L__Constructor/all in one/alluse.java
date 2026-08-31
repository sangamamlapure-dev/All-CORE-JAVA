class Student{
	private int age;
	private String name;
		Student(int age, String name){
			this.name=name;
			this.age=age;
		}
		void setage(int setage){
			 this.age= age;
		}
		int getage(){
			return age;
		}
		void setname(int setage){
			 this.name= name;
		}
		String getname(){
			return name;
		}

}
class Codex{
	public static void main(String args[]){
		Student s1 = new Student(10,"sangam");
		s1.setage(20);
		System.out.println("age is: "+ s1.getage());
		System.out.println("name is: "+ s1.getname());

	}
}
