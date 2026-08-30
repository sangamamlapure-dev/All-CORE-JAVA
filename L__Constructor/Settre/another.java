class Bank {
    private int balance = 5000;
}

class Codex {

    void show(Bank b) {
        System.out.println(b.balance); 
    }

    public static void main(String args[]) {
        Bank b = new Bank();

        Codex c = new Codex();
        c.show(b);
    }
}