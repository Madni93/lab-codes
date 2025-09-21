import java.util.Scanner;

public class w3q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area=1,length,breadth;
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();

        area = length*breadth;

        System.out.println("Area is: " + area);
    }
}
