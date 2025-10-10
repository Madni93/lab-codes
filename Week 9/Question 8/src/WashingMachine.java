public class WashingMachine extends Appliance{

    WashingMachine(String brand,int power){
        super(brand,power);
    }
    public void turnOn(){
        System.out.println("Washing Machine turned on!");
    }
    public void turnOff(){
        System.out.println("Washing Machine turned off!");
    }
}
