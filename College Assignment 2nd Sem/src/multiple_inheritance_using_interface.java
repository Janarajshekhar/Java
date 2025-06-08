import java.util.Scanner;

interface Shape_ {
    void area(double length, double width);
}

interface Perimeter {
    void perimeter(double length, double width);
}

class Rectangle implements Shape_, Perimeter {
    public void area(double length, double width) {
        double a = length * width;
        System.out.println("Area = " + a);
    }

    public void perimeter(double length, double width) {
        double p = 2 * (length + width);
        System.out.println("Perimeter = " + p);
    }
}

public class multiple_inheritance_using_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle r = new Rectangle();
        r.area(l, w);
        r.perimeter(l, w);
    }
}
