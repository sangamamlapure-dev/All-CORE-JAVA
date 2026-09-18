class codex{
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    void drive(Engine e) {
        e.start();
        System.out.println("Car is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Engine e = new Engine();

        c.drive(e);
    }
}