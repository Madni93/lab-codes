import java.util.Scanner;

public class w7q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";
        int len = str.length();
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.print("Reversed String is: "+ rev);
    }
}
