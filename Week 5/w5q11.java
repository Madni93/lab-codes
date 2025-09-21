// Write a Java program to print the following 
// pattern: 
//                     * 
//                    ** 
//                   *** 
//                    ** 
//                     *

import java.util.Scanner;

public class w5q11 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = sc.nextInt();  
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" ");  //loop 1 for spaces
            }
            for(j=1;j<=i;j++){
                System.out.print("*"); //loop 2 for pattern till half
            }
            System.out.print("\n");
        }
        for(i=1;i<=n-1;i++){
             for(j=0;j<=i;j++){
                System.out.print(" "); //space for other half
            }
            for(j=n-1;j>=i;j--){
                System.out.print("*"); //pattern for other half
            }
            System.out.print("\n");
        }
    }
}
