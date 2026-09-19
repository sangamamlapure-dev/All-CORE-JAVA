class Employee{
	String name;
	int age;
		Employee(String name,int age){
			this.name=name;
			this.age=age;
		}
	void Display(Company C){
		System.out.println(name+" "+age);
		System.out.println(C.Cname+" "+C.Clocation);		
	}
}
class Company{
	String Cname;
	String Clocation;
		Company(String Cname,String Clocation){
			this.Cname=Cname;
			this.Clocation=Clocation;
		}

}
class Main{
	public static void main(String args[]){
		Company C1 =new Company("Tcs","Pune");
		Employee E1=new Employee("Sangam",21);
		E1.Display(C1);
		
		Company C2 =new Company("Cpagemini","Mumbai");
		Employee E2=new Employee("Harshal",20);
		E2.Display(C2);
	}
}