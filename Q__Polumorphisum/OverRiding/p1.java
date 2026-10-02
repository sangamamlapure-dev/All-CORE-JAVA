class parent {

    void sound() {
        System.out.println("Sound");
    }
}

class Dog extends parent {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}