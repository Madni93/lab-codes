import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        String id = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        Account a = new Account(id,name,address,0);

        System.out.print("Enter amount you want to deposit: ");
        int amount = sc.nextInt();

        a.deposit(amount);


        System.out.print("Enter amount you want to withdraw: ");
        int withdrawAmt = sc.nextInt();

        a.withdraw(withdrawAmt);
        double simpleInt = Account.calculateSimpleInterest(500,20,5);
        double compInt = Account.calculateCompoundInterest(500,10,5,4);

        System.out.printf("Simple Interest is %.2f: ",simpleInt);
        System.out.println();
        System.out.printf("Compound Interest is %.2f: ",compInt);
    }
}
