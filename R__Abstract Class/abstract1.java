class Main {
    public static void main(String[] args) {

        Parent p;

        p = new Student();
        p.education();

        p = new Teacher();
        p.education();
    }
}

class Parent {
    void education() {
        System.out.println("Parent education");
    }
}

class Student extends Parent {
    void education() {
        System.out.println("Student is studying");
    }
}

class Teacher extends Parent {
    void education() {
        System.out.println("Teacher is teaching");
    }
}