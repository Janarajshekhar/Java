public class this3 {
    double radius; // instance variable

    // First constructor: defines radius
    this3(double r) {
        radius = r;
        System.out.println("Radius defined: " + radius);
    }

    // Second constructor: calculates area using this()
    this3() {
        this(8.0); // calls the first constructor with a default radius
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        this3 obj = new this3();
    }
}
