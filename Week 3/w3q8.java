import java.util.Scanner;

public class w3q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();
        System.out.println(temp);
        double finalTemp = (temp*(9.0/5.0)) + 32;

        System.out.println("Temperature in fahrenhiet is: "+ finalTemp);
    }
}
