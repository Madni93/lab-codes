//Write a Java program that takes a number as input and prints its 
// multiplication table upto 10.

import java.util.Scanner;

public class w4q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d is %d",x,i,x*i);
            System.out.print("\n");
        }
    }
}
