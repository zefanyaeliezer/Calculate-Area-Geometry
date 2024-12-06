// AreaCalculator.java
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of the rectangle: ");
                double rectLength = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double rectWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectLength, rectWidth);
                System.out.println("Area of the rectangle: " + rectangle.calculateArea());
                break;

            case 2:
                System.out.print("Enter base of the triangle: ");
                double triBase = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double triHeight = scanner.nextDouble();
                Triangle triangle = new Triangle(triBase, triHeight);
                System.out.println("Area of the triangle: " + triangle.calculateArea());
                break;

            case 3:
                System.out.print("Enter radius of the circle: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.println("Area of the circle: " + circle.calculateArea());
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
