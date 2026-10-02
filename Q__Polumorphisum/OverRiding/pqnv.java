class Payment {

    void pay() {
        System.out.println("Payment");
    }

    void pay(int amount) {
        System.out.println("Payment of " + amount);
    }

    void pay(int amount, String method) {
        System.out.println("Payment of " + amount + " using " + method);
    }
}

class Main {

    public static void main(String[] args) {

        Payment p = new Payment();

        p.pay();

        p.pay(500);

        p.pay(1000, "UPI");
    }
}