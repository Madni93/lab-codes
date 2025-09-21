import java.util.Scanner;

public class w3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float x = sc.nextFloat();
        System.out.print("Enter second number: ");
        float y = sc.nextFloat();

        float mult = x*y;
        System.out.println("Result is: "+mult);
    }
}
