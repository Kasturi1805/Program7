package Program7;

    public class RectanglePerimeter {
    double length;
    double breadth;

    // Constructor
    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Main method to test the class
    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(10.5, 5.5);
        System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    }
}

    

