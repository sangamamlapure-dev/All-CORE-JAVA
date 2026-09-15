class Box {

    int length;
    int width;

    Box() {
        length = 10;
        width = 10;
    }

    Box(int l, int w) {
        length = l;
        width = w;
    }

    void display() {
        System.out.println(length * width);
    }

    public static void main(String[] args) {

        Box b1 = new Box();
        Box b2 = new Box(20, 5);

        b1.display();
        b2.display();
    }
}