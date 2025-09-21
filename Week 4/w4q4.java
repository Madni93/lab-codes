import java.util.Scanner;

public class w4q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int x = sc.nextInt();
        int sum =0;
        for(int i=1;i<=x;i++){
           sum = sum + i;
        }
        System.out.println("Sum is: " + sum);
    }
}