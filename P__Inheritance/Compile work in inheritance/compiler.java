class Main{
    public static void main(String[] args) {
  	Child c= new Child();
	c.fun();      
    }
}

class Parent{
    void fun() {
        System.out.println("Parent");
    }
}

class Child extends Parent{

}
