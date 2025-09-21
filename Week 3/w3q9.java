import java.util.Scanner;

public class w3q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = sc.nextDouble();
        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        double rem = x%y;
        double quo = x/y;

        System.out.println("Remainder is: " + rem + "\nQuotient is: " + quo);
    }
}
