import java.util.Scanner;

public class w3q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double circum = 2*(22.0/7.0)*radius;
        System.out.printf("Circum is: %.2f",circum);
    }
}
