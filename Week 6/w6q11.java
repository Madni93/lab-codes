import java.util.Scanner;
//Write a Java program to find the frequency of each character in a given string. 
public class w6q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int length = str.length();
        boolean visited[] = new boolean[length];
        for(int i = 0;i<length;i++){
            if(visited[i]){
                continue;
            }
            char ch = str.charAt(i);
            int count = 1;
            for(int j=i+1;j<length;j++){

                char ch1 = str.charAt(j);
                if(ch1==ch){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.printf(" %c is %d ",ch,count);
        }
        
    }
}
