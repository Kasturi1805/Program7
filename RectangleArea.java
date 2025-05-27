//package Program7;

    public class RectangleArea {
    double length;
    double breadth;

    // Constructor
    public RectangleArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Main method to test the class
    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea(10.5, 5.5);
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}

    

