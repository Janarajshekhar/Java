
class Vehicle {
    final void print() {
        System.out.println("Hello......");
    }
}
class Bike extends Vehicle {
//    void print() {
//        System.out.println("world......");
//    }
}

public class final2 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.print();
    }
}
