import java.util.Scanner;
 
public class w4q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = sc.nextInt();
        System.out.println("Factors are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.printf("%d ",i);
            }
        }
    
    }
}
    