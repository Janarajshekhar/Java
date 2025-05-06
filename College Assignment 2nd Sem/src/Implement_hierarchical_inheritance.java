import java.util.Scanner;
class setRadius{
    double r;
    public void radius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r=sc.nextDouble();
    }
}
class calculateAreaOfCircle extends setRadius{
    double a;
    void area(){
        a=3.14*r*r;
        System.out.println("Area = "+a);
    }
}
class calculateCircumference extends setRadius{
    double b;
    void Circumference(){
        b=2*3.14*r;
        System.out.println("Circumference = "+b);
    }
}
public class Implement_hierarchical_inheritance {
    public static void main(String []args){
        calculateAreaOfCircle x=new calculateAreaOfCircle();
        calculateCircumference y=new calculateCircumference();
        x.radius();
        y.r=x.r;
        x.area();
        y.Circumference();
    }
}
