class Student {
    private String name = "Sangam";

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.getName());
    }
}