import java.util.Scanner;
interface circle{
    public void area(double r);
}
class area_of_circle implements circle{
    public void area(double r){
        double a=3.14*r*r;
        System.out.println("Area = "+a);
    }
}
class circumference_of_circle extends area_of_circle{
    public void circumference(double r){
        double c=2*3.14*r;
        System.out.println("Circumference = "+c);
    }
}
public class multilevel_inheritance_using_interface {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double r=sc.nextDouble();
        circumference_of_circle c=new circumference_of_circle();
        c.area(r);
        c.circumference(r);
    }
}
