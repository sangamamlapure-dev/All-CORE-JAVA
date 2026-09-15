class Car {

    String brand;
    int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println(brand + " = " + price);
    }

    public static void main(String[] args) {

        Car c1 = new Car("BMW", 5000000);
        Car c2 = new Car("Audi", 4000000);
        Car c3 = new Car("Tata", 1500000);

        c1.display();
        c2.display();
        c3.display();
    }
}