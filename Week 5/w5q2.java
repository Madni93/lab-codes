import java.util.Scanner;
//Write a Java program to calculate the sum of all the array elements.
public class w5q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum is " + sum);
    }
}
