import java.util.Scanner;

public class w6q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter element [%d] (index %d): ",i+1,i);
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int i=0;i<n;i++){
           
           if(arr[i]>largest){
                largest = arr[i];
           }
        }
         int secLargest = arr[0];

          for(int i=0;i<n;i++){
           if(arr[i]==largest){
            continue;
           }
           if(arr[i]>secLargest){
                secLargest = arr[i];
           }

        }
        System.out.printf("Largest is: %d, Second largest is %d",largest,secLargest);
    }
}

