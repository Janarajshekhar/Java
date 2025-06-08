import java.util.Scanner;

interface _Shape {
    void area();
}

class _Rectangle implements _Shape {
    double length, width;

    _Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle = " + a);
    }
}

class Circle implements _Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

public class hierarchical_inheritance_using_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        _Rectangle rect = new _Rectangle(l, w);
        rect.area();

        System.out.println("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle cir = new Circle(r);
        cir.area();
    }
}
