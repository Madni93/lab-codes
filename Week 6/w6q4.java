import java.util.Scanner;

public class w6q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.printf("Enter element [%d]: ",i+1);
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];
        
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.printf("Largest is %d, Smallest is %d",largest,smallest);
    }
}
