class Student{
	String name="sangam";
	collage clg;

	Student(collage c1){
		this.clg=c1;
	}
	void Display(){
		System.out.println(name);
	}
	
}
class Collage{
	String cname="kbp";
}
class Main{
	public static void main(String args[]){
		Collage c1= new Collage();
		Student s1=new Student(c1);
		s1.Display();
	}
}