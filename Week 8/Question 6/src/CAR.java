class CAR {
    private String model;
    private String color;
    private double price;

    public CAR() {
        this("Unknown Model", "White", 0.0);
    }

    public CAR(String model) {
        this(model, "White", 0.0);
    }

    public CAR(String model, String color) {
        this(model, color, 0.0);
    }

    public CAR(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setDetails(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        CAR car1 = new CAR();
        CAR car2 = new CAR("Toyota");
        CAR car3 = new CAR("Honda", "Red");

        car1.setDetails(500000);
        car2.setDetails(800000);
        car3.setDetails(1000000);

        car1.display();
        car2.display();
        car3.display();
    }
}
