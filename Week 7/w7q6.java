import java.util.Scanner;

public class w7q6 {

    static void fib(int n){
        int a=0,b=1,sum=0;
        System.out.print("0 1 ");
        for(int i=3;i<=n;i++){
            sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum + " ");
        }
    }

    static int fibrec(int n){
        if(n<=1)
            return n;
        return fibrec(n-1) + fibrec(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
        System.out.print("\nPress 1 for without recursion\nPress 2 for with recursion\nPress 0 to exit\n");
        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();
        if(choice==0)
            break;
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        

        switch(choice){
            case 1:
            fib(n);
            break;

            case 2:
            for(int i=0;i<n;i++){
                System.out.print(fibrec(i)+" ");
            }
            break;
        }
        }while(choice!=0);
    }
}
