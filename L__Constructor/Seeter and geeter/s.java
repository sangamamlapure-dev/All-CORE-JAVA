class Student {
    private int id;
    private String name;

    // Setter
    void setId(int a) {
        id = a;
    }

    void setName(String b) {
        name = b;
    }

    // Getter
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}

class Codex {
    public static void main(String args[]) {

        Student s = new Student();

        s.setId(101);
        s.setName("Sangam");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}