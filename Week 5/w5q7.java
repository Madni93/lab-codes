import java.util.Scanner;

public class w5q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int largest = arr[0];
        for(int i=0;i<n;i++){
            System.out.println("Enter element " + (i+1));
            arr[i] = sc.nextInt();
            if(arr[i]>largest){
                largest = arr[i];
            }
        }      
        System.out.println("Largest is "+ largest);
    }
}

