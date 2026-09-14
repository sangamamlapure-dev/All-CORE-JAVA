class Bank {
    private int balance = 5000;

    public void showBalance() {
        System.out.println(balance);
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.showBalance();
    }
}