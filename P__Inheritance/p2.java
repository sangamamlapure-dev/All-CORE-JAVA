class A {
    void show() {
        System.out.println("Parent");
    }
}

class B extends A {
}

class C extends A {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}