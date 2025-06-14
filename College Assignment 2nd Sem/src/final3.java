
import java.util.Scanner;

final class Rectangle_ {
    private double length;
    private double width;

    Rectangle_(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class final3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        Rectangle_ rect = new Rectangle_(length, width);

        System.out.println("Area of the rectangle is: " + rect.calculateArea());
    }
}
