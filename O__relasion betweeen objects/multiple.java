class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student s) {
        System.out.println(name + " teaches " + s.name);
    }
}

class College {
    String collegeName;
    Teacher teacher;

    College(String collegeName, Teacher teacher) {
        this.collegeName = collegeName;
        this.teacher = teacher;
    }

    void display(Student s) {
        System.out.println("College: " + collegeName);
        teacher.teach(s);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Sangam");
        Teacher t = new Teacher("Mr. Patil");

        College c = new College("KBPCOE", t);

        c.display(s);
    }
}