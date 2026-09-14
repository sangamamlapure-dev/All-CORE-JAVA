class Student {
    private int age = 20;

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getAge());
    }
}