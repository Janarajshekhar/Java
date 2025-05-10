import java.util.Scanner;
interface Box{
    void length_width(double length,double width);
}
class area implements Box{
    public void length_width(double length,double width){
        double area=length*width;
        System.out.println("Area = "+area);
    }
}
public class single_inheritance_using_interface {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width : ");
        double l=sc.nextDouble();
        double w=sc.nextDouble();
        area a=new area();
        a.length_width(l,w);
    }
}