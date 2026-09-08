class Codex {
    int a = 10;

    void fun() {
        a++;
        System.out.println(a);
    }
}

class Main {
    public static void main(String[] args) {
        Codex c1 = new Codex();
        Codex c2 = new Codex();

        c1.fun();
        c2.fun();
        c1.fun();
    }
}