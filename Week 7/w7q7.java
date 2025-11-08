import java.util.Scanner;

public class w7q7 {

    public static int gcdr(int dividend,int divisor){
        
        int rem = dividend%divisor;

        if(rem==0){
            return divisor;
        }
        else{
            return gcdr(divisor,rem);
        }
    }
    public static void gcd(int dividend,int divisor){
        int rem = dividend%divisor;

        while(true){
            if(rem==0){
                System.out.print("GCD is: "+divisor);
                break;
            }
            else{
                dividend = divisor;
                divisor = rem;
                rem = dividend%divisor;
            }
        }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int divisor = Math.min(a, b);
        int dividend = Math.max(a, b);
        int choice;
        do{
            System.out.print("\nPress 1 for GCD via normal method\nPress 2 for GCD via recursion\nPress 0 to exit\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                 gcd(dividend,divisor);
                 break;
                case 2:
                 int ans = gcdr(dividend, divisor);
                 System.out.println("\nGCD is: "+ ans);
                 break;
                 default:
                 System.out.println("Incorrect option");
            }

        }while(choice!=0);
        
    }
}
