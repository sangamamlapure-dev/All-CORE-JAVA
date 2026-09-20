class A {
    void show() {
        System.out.println("Parent");
    }
}

class B extends A {
}

class C extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

        C obj2 = new C();
        obj2.show();
    }
}