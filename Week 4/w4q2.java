import java.util.Scanner;

public class w4q2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        int large = x;
        if(y>x && y>z){
            large = y;
        }
        else if(z>x && z>y){
            large = z;
        }
        else if(x==y && x==z && y==z){
            System.out.println("All are equal");
        }
        else{
            large = x;
        }
        System.out.print("Largest number is: "+large);
    }
}
