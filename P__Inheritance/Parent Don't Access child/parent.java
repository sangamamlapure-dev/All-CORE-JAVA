class main{
	public static void main(String[] args){
		child c = new child();
		c.education();
		c.proparty();

		System.out.println("------parent--------");
		parent p = new parent();
		p.proparty();
		p.education();
	}
}
class parent{
	void proparty(){
		System.out.println("5 cr");
	}
}
class child extends parent{
	void education(){
		System.out.println("btech-KBP");
	}
}