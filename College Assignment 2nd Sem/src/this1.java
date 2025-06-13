public class this1 {
    int x;

    this1(int x) {
        this.x = x; // refers to instance variable
    }

    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        this1 obj = new this1(10);
        obj.display();
    }
}

