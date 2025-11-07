import java.util.Scanner;

// Custom Exception Class
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}

public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Length and Width must be positive values!");
        }
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double area() {
        return length * width;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter width of rectangle: ");
            double width = sc.nextDouble();

            // Object creation with validation
            Rectangle rect = new Rectangle(length, width);

            // Displaying results
            System.out.println("Area of Rectangle: " + rect.area());
            System.out.println("Perimeter of Rectangle: " + rect.perimeter());

        } catch (InvalidDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input! Please enter numeric values.");
        }

        sc.close();
    }
}

