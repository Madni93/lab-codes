public class Account {
    String id;
    String Account_holder_name;
    String Address;
    double balance;

    Account(String id,String Account_holder_name,String Address, double balance){
        this.id = id;
        this.Account_holder_name = Account_holder_name;
        this.Address = Address;
        this.balance = balance;
    }

    void deposit(int amount){
        balance = balance + amount;
        System.out.println("Updated balance: "+ balance);
    }
    void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Updated balance: "+ balance);
    }

    static double calculateSimpleInterest(double amt,double rate,int time){
        return (amt*rate*time)/100;
    }
    static double calculateCompoundInterest(double amt,double rate,int numberOfTimes,int time){
        return amt*Math.pow((1+(rate /numberOfTimes)),numberOfTimes*time);
    }


}
