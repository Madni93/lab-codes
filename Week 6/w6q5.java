
public class w6q5 {

    boolean isPrime(int n){
        int c = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        w6q5 obj = new w6q5();
        for(int i = 0;i<=100;i++){
            if(obj.isPrime(i)==true && i!=0){
                System.out.print(i + " ");
            }
        }
    }

}
