//decimal to hexadecimal
import java.util.Scanner;

public class w5q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        String hex = "";
        while(n>0){
            int r = n%16;
            if(r == 10){
                hex = 'A' + hex;
            }
            else if(r==11){
                hex = 'B' + hex;
            }
            else if(r==12){
                hex = 'C' + hex;
            }
            else if(r==13){
                hex = 'D' + hex;
            }
            else if(r==14){
                hex = 'E' + hex;
            }
            else if(r==15){
                hex = 'F' + hex;
            }
            else{
                hex = r+hex;
            }
            n=n/16;
        }
        System.out.println(hex);
    }
}
