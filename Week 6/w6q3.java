import java.util.Scanner;

public class w6q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];

        for(i=0;i<n;i++){
            System.out.printf("Enter element [%d]: ",i+1);
            arr[i] = sc.nextInt();
        }
        
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        System.out.println("New array is: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
