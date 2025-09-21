import java.util.Scanner;

public class w6q9 {
    // fibonacci series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int n = sc.nextInt();
        int firstElem = 0;
        int secondElem = 1;
        System.out.print("0 1 ");
        for (int i = 3; i <= n; i++) {
            int sum = firstElem + secondElem;

            firstElem = secondElem;
            secondElem = sum;

            System.out.print(sum + " ");
        }
    }
}


