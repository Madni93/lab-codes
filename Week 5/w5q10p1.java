import java.util.Scanner;

public class w5q10p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        int temp = n;
        String hex = "";
        char hexCodes[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(temp>0){
            int rem = temp%16;
            hex = hexCodes[rem] + hex;
            temp = temp/16;
        }
        System.out.println(hex);
        System.out.print("Enter hexadecimal number: ");
        String hexadec = sc.next();
        int value,power=1;
        int decValue = 0;
        for(int i = hexadec.length()-1;i>=0;i--){
            char c = hexadec.charAt(i);
            if(c > '0' && c < '9'){
                value = c - '0';
            }
            else{
                value = (c - 'A') + 10;
            }
            decValue += value*power;
            power *= 16; 
        }
        System.out.println("Value is: "+ decValue);
    }
}
