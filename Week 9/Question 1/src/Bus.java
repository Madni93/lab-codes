public class Bus extends Vehicle{
    Bus(int costOfTravel){
        super(costOfTravel);
    }
    void display(){
        System.out.println("Cost of travelling by bus is: "+costOfTravel);
    }
}
