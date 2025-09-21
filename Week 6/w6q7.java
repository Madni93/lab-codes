public class w6q7 {
    // this is same as q5 but im using another way of doing it

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(n + " ");
            }

                
        }
    }
}
