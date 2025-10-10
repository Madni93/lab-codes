public abstract class Appliance {
    String brand;
    int power;

    Appliance(String brand,int power){
        this.brand = brand;
        this.power = power;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
