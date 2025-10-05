public class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void area(){
        System.out.printf("Area of rectangle is: %d",length*breadth);
    }
}
