import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FRUIT f1 = new FRUIT();
        System.out.print("Enter color of fruit 1: ");
        String color1 = sc.nextLine();
        System.out.print("Enter taste of fruit 1: ");
        String taste1 = sc.nextLine();
        System.out.print("Enter price of fruit 1: ");
        double price1 = sc.nextDouble();
        sc.nextLine();
        f1.setDetails(color1,taste1,price1);
        f1.display();

        FRUIT f2 = new FRUIT();
        System.out.print("\nEnter color of fruit 2: ");
        String color2 = sc.nextLine();
        System.out.print("Enter taste of fruit 2: ");
        String taste2 = sc.nextLine();
        System.out.print("Enter price of fruit 2: ");
        double price2 = sc.nextDouble();
        sc.nextLine();
        f2.setDetails(color2, taste2, price2);
        f2.display();
        
        FRUIT f3 = new FRUIT();
        System.out.print("\nEnter color of fruit 3: ");
        String color3 = sc.nextLine();
        System.out.print("Enter taste of fruit 3: ");
        String taste3 = sc.nextLine();
        System.out.print("Enter price of fruit 3: ");
        double price3 = sc.nextDouble();
        sc.nextLine();
        f3.setDetails(color3, taste3, price3);
        f3.display();
    }   
}

