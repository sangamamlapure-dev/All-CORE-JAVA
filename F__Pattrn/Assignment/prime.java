import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lineNo = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNo + " " + line);
            lineNo++;
        }

        sc.close();
    }
}