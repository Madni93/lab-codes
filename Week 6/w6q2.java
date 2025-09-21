import java.util.Scanner;

public class w6q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n == 0) {
                System.out.println("0 is not prime");
            }
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
