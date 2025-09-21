import java.util.Scanner;
// Write a Java program to calculate the sum of all even numbers from 1 up to a given number N. 
public class w4q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=2;i<=n;i+=2){
            System.out.printf("%d ",i);
            sum = sum+i;
        }
        System.out.println("\nSum is: "+ sum);
    }
}
