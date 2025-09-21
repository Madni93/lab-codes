import java.util.Scanner;

public class w7q8 {
    static int frequency(String s,char ch){
        int c=0;
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==ch){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second string: ");
        String s2 = sc.nextLine();
        int len = s1.length();
        boolean flag=true;
        for (int i = 0; i < len; i++) {
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch); 
            if(frequency(s1, ch)!=frequency(s2,s2.charAt(index))){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
