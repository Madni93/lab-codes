import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FRUIT f1 = new FRUIT();
        System.out.print("Enter color of fruit 1: ");
        f1.color = sc.nextLine();
        System.out.print("Enter taste of fruit 1: ");
        f1.taste = sc.nextLine();
        System.out.print("Enter price of fruit 1: ");
        f1.price = sc.nextDouble();
        sc.nextLine();
        f1.display();

        FRUIT f2 = new FRUIT();
        System.out.print("\nEnter color of fruit 2: ");
        f2.color = sc.nextLine();
        System.out.print("Enter taste of fruit 2: ");
        f2.taste = sc.nextLine();
        System.out.print("Enter price of fruit 2: ");
        f2.price = sc.nextDouble();
        sc.nextLine();
        f2.display();
        
        FRUIT f3 = new FRUIT();
        System.out.print("\nEnter color of fruit 3: ");
        f3.color = sc.nextLine();
        System.out.print("Enter taste of fruit 3: ");
        f3.taste = sc.nextLine();
        System.out.print("Enter price of fruit 3: ");
        f3.price = sc.nextDouble();
        sc.nextLine();
        f3.display();
    }   
}
