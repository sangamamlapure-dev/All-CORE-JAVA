import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

	 System.out.println("Enter Num");
	 int n = sc.nextInt();
	
	 System.out.println("------------------");
	 System.out.println("this number is");

     	  if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}