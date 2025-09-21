import java.util.Scanner;
public class w7q2 {

    public static void bubbleSort(int arr[]){
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
    }
}

