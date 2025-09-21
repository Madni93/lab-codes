import java.util.Scanner;

public class w7q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();

        boolean flag = true;
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                System.out.println("Not palindrome");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }

    }
}
