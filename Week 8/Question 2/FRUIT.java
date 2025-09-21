public class FRUIT{
    private String color;
    private String taste;
    private double price;

    void setDetails(String color,String taste,double price){
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    void display(){
        System.out.print("Color is: "+ color);
        System.out.print("\nTaste is: "+ taste);
        System.out.print("\nPrice is: "+ price);
    }
}