import java.util.*;

public class w3q6{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("First Number after exchange is: " + x + "\nSecond number after exchange is: " + y);

    }
}