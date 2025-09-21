import java.util.Scanner;

public class w6q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter element [%d] (index %d): ",i+1,i);
            arr[i] = sc.nextInt();
        }

        System.out.print("Old array is: ");

         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        int temp;

        for(int i=0;i<n/2;i++){
           
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            
          
        }
        System.out.print("\nReversed array is: ");

         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

