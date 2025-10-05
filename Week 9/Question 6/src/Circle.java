public class Circle extends Shape{
    int radius;
    double pi = 3.14;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    void area(){
        System.out.printf("\nArea of circle is: %.2f",(pi*radius*radius));
    }
}
