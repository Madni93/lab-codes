import java.util.Scanner;

public class w6q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter element [%d] (index %d): ",i+1,i);
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to search: ");
        int x = sc.nextInt();

        for(int i=0;i<n;i++){
           
           if(arr[i]==x){
            System.out.printf("Element found at index %d",i);
           }

        }
    }
}
