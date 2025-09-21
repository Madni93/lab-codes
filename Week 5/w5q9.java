import java.util.Scanner;

public class w5q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int temp = n;
        int rev=0;
        while(n>0){
            int digits = n%10;
            rev =  digits + rev*10;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }

    }
}

