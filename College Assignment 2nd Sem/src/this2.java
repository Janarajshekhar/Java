public class this2 {
    void show(double r) {
        System.out.println("Area of circle : "+3.14*r*r);
    }

    void display(double r) {
        this.show(r); // invokes current class method
    }

    public static void main(String[] args) {
        this2 obj = new this2();
        obj.display(5.0);
    }
}
