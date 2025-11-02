public class Main {
    public static int divide(int a, int b){
        return a/b;
    }

    static void main() throws ArithmeticException{
        try{
            int res = divide(1,0);
        }catch(ArithmeticException e){
            System.out.println("Dividing by zero is not allowed!");
        }
    }
}
