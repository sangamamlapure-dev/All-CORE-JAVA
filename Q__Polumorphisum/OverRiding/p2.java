
class Parent {
    void sound() {
        System.out.println("Parent Sound");
    }

    void sound(String name) {
        System.out.println(name + " Sound");
    }
}

class Dog extends Parent {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Overloading
        d.sound("Dog");

        // Overriding
        Parent p = new Dog();
        p.sound();
    }
}