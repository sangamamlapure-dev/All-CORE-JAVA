class Employee{
	String name;
	int age;
	Company C;
		Employee(int age,String name,Company C){
			this.age=age;
			this.name=name;
			this.C=C;
		}
		void getage(int age){
			return age;
		}
		String name(String name){
			return name;
		}
		void getCompany(Company C){
			return C;
		}
}	

class Company(){
	String Cname;
	String Clocation;
		Company(String Cname,String Clocation){
				this.Cname=Cname;
				this.Clocation=Clocation;
		}
		void getCname(String Cname){
			return Cname;
		}
		String location(String Clocation){
			return Clocation;
		}
}

class Main{
	public static void main(string args[]){
		Company c1=new Company("Tcs","Benguluru");
		Employee E1=new Employee("Sangam",21,C1);
		System.out.print(E1.getname" "+E1.getage);
		System.out.println();
		System.out.println(E1.getCompany);
		

	}
}