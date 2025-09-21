// Write a Java program to take a number, divide it by 2 and print the result 
// until the number becomes less than 10. 
import java.util.Scanner;

public class w4q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        while(x>=10){
            x /= 2;
            System.out.println(x + " ");
        }      
    }
}
