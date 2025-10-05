public class Train extends Vehicle{
    Train(int costOfTravel) {
        super(costOfTravel);
    }
    void display(){
        System.out.println("The cost of travelling by train is: "+costOfTravel);
    }
}
