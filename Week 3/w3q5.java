import java.util.Scanner;

public class w3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first x coordinate: ");
        int x1 = sc.nextInt();
        System.out.print("Enter first y coordinate: ");
        int y1 = sc.nextInt();
        System.out.print("Enter second x coordinate: ");
        int x2 = sc.nextInt();
        System.out.print("Enter second y coordinate:");
        int y2 = sc.nextInt();

        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Result is: "+distance);
    }
}

