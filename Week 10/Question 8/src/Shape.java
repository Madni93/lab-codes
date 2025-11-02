class Shape {

    // Area of a square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of a rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of a circle
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(5);           // square
        s.area(4, 6);        // rectangle
        s.area(3.5);         // circle
    }
}
