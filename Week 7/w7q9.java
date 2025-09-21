import java.util.Scanner;

public class w7q9 {

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int Pi(int arr[],int low,int high){
       int pivot = low;
       int i=low;
       int j=high;
       while(i<j){
           while(i<=high && arr[i]<=arr[pivot]){
            i++;
           }
           while(j>=low && arr[j]>arr[pivot]){
            j--;
           }
           if(i<j){
            swap(arr, i, j);
           }
       }                        
       swap(arr, j, pivot);
       return j;
    }

    static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi = Pi(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i + " ");     
        }
    }
}
