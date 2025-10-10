public class Refrigerator extends Appliance{
    Refrigerator(String brand,int power){
        super(brand,power);
    }
    public void turnOn(){
        System.out.println("Refrigerator turned on!");
    }
    public void turnOff(){
        System.out.println("Refrigerator turned off!");
    }
}
