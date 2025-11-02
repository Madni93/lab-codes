public class InsufficientFundsException extends Exception{
    InsufficientFundsException(){
        super("Not enough balance");
    }
}
