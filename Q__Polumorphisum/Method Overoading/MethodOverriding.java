class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.education();
    }
}

class Parent {
    void education() {
        System.out.println("Parent education");
    }
}

class Child extends Parent {
    @Override
    void education() {
        System.out.println("Child education");
    }
}