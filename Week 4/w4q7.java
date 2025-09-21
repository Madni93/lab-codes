import java.util.Scanner;
// Write a Java program to find the smallest number among four given numbers. 
public class w4q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter number 1: ");
         a = sc.nextInt();
        System.out.print("Enter number 2: ");
         b = sc.nextInt();
        System.out.print("Enter number 3: ");
         c = sc.nextInt();
        System.out.print("Enter number 4: ");
         d = sc.nextInt();
        
         int smol = a;
         if(a<b && a<c && a<d){
            smol = a;
         }
         else if(b<a && b<c && b<d){
            smol = b;
         }
         else if(c<b && c<a && c<d){
            smol = c;
         }
         else{
            smol = d;
         }
         System.out.println("smallest: " + smol);
    }
}
