public class FRUIT {
    String color;
    String taste;
    double price;

    FRUIT(String color,String taste,double price){
        this.color = color;
        this(taste, price);
    }
    FRUIT(String color){
        this.color = color;
    }
    FRUIT(String taste,double price){
        this.taste = taste;
        this.price = price;
    }

    void display(){
        System.out.print("Color is: "+ color);
        System.out.print("\nTaste is: "+ taste);
        System.out.print("\nPrice is: "+ price);
    }
}
