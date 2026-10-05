class Main {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();

        a = new Cow();
        a.sound();
    }
}

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog says Bow Bow");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat says Meow");
    }
}

class Cow extends Animal {

    void sound() {
        System.out.println("Cow says Moo");
    }
}