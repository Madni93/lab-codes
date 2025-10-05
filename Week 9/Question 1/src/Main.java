import java.util.Scanner;

public class Main {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter cost of travelling by bus: ");
            int costBus = sc.nextInt();
            Bus b1 = new Bus(costBus);
            b1.display();

            System.out.println("------------------------");

            System.out.print("Enter cost of travelling by train: ");
            int costTrain = sc.nextInt();
            Train t1 = new Train(costTrain);
            t1.display();
        }
    }
