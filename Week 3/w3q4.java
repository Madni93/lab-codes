import java.util.Scanner;

public class w3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        double avg = (x+y+z)/3.0;
        System.out.println("Result is: "+avg);
    }
}
