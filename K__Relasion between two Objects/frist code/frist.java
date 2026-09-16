class Student{
	String name="sangam";
	void Display(){
			System.out.println(name);
			Collage c1= new Collage();
			System.out.println(c1.cname);
	}
	
}
class Collage{
	String cname="kbp";
}
class Main{
	public static void main(String args[]){
		Student s1=new Student();
		s1.Display();
	}
}