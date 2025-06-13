class Printer {
    void area(this4 a) {
        // Calculate and display area using object's fields
        double area = a.length * a.breadth;
        System.out.println("Length: " + a.length);
        System.out.println("Breadth: " + a.breadth);
        System.out.println("Area of Rectangle: " + area);
    }
}

public class this4 {
    double length;
    double breadth;

    this4(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculate_area() {
        Printer p = new Printer();
        p.area(this); // passing current instance
    }

    public static void main(String[] args) {
        this4 rectangle = new this4(10.0, 5.0);
        rectangle.calculate_area();
    }
}
