class Circle_ {
    double radius;

    Circle_(double radius) {
        this.radius = radius;
        new CircumferenceCalculator(this); // Passing this to another class
    }
}

class CircumferenceCalculator {
    CircumferenceCalculator(Circle_ c) {
        double circumference = 2 * 3.14 * c.radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}

public class this6 {
    public static void main(String[] args) {
        new Circle_(5);
    }
}
