import java.util.Scanner;

public class w5q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        double n = sc.nextDouble();
        double sum = 0.0;
        for(int i=1;i<=n;i++){
            sum = sum + (1.0/i);
        }
        System.out.println("Sum is: "+ sum);
    }
}
