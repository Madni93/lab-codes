// Write a Java program to check whether a given character is a vowel or 
// consonant. 
import java.util.*;

public class w4q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char x = Character.toUpperCase(sc.next().charAt(0));
        if(x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println("Its a vowel");
        }
        else if(Character.isDigit(x) == true){
            System.out.println("Only letters are accepted");
        }
        else{
            System.out.println("Its a consonant");
        }
    }
}
