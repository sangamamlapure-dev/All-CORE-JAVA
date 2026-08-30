class employee{
	int id ;
	String name;
	String address;
	String comp;
	int salary;
		employee(int a, String b, String c, String d, int e){
			a=id;
			b=name;
			c=address;
			d=comp;
			e=salary;
		}
		void display(){
			System.out.println("id"+ id);
			System.out.println("name"+ name);
			System.out.println("address"+ address);
			System.out.println("company"+ comp);
			System.out.println("name"+ salary);
		}

}

class Codex{
	public static void main(String args[]){
		employee e1 = new employee(1,"sangam","nanded","tcs",100000);
		employee e2 = new employee(1,"harshal","satara","tcs",100000);
		employee e3 = new employee(1,"yougesh","latur","meta",10000000);
		employee e4 = new employee(1,"premkumar","satara","capgemini",80000);
		e1.display();
		e2.display();
		e3.display();
		e4.display();
				
	}
}