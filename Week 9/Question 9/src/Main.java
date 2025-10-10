public class Main {
    static void main() {
        int a=10;
        int b=6;
        int gcd =  MathOperations.findGCD(a,b);
        int lcm =  MathOperations.findLCM(a,b);
        System.out.println("GCD is: "+gcd);
        System.out.println("LCM is: "+lcm);
    }
}
