class main{
	child c = new child(21,Sangam,2010,KBP);
	
	
	
}

class parent{
	int age;
	int name;
	parent(int age,String name){
		this.age=age;
		this.name=name;
		
	}
}


class child{
	int RollNo;
	String clg;
	child(int age,String name,int RollNo,String clg){
		super(RollNo,clg);
		this.clg=clg;
		this.RollNo=RollNo;
		
	}
}