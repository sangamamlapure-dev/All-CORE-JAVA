class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.education();
    }
}

abstract class Parent {
    abstract void education();
}

class Child extends Parent {
    void education() {
        System.out.println("B.Tech Computer Science");
    }
}