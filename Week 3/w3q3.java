import java.util.Scanner;

public class w3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        double cube = Math.pow(x,3);
        System.out.println("Result is: "+cube);
    }
}

