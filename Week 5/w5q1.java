import java.util.Scanner;
// Write a Java program to insert 10, 20, 30 ....in an array and display them. 
public class w5q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit N: ");
        int n = sc.nextInt();
        int num=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            num = num+10;
            arr[i] = num;
        }
        System.out.println("Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}