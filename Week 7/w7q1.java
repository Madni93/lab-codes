import java.util.Scanner;
public class w7q1 {

    public static void bubbleSort(int[] arr){
        int i,j,temp;
        int n = arr.length;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void binarySearch(int[] arr, int x){
        int n = arr.length;
        int low=0,high=n-1;
        int mid = (low+high)/2;

        while(low<=high){
            if(arr[mid]==x){
                System.out.printf("Element found at index %d and position %d",mid,mid+1);
                break;
            }
            else if(x<arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        if(low>high){
            System.out.println("Element not found!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter element "+ (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("Array after sorting");
        for(int e:arr){
            System.out.print(e + " ");
        }
        System.out.print("\nEnter the element you want to search: ");
        int x = sc.nextInt();
        binarySearch(arr, x);
    }
}
