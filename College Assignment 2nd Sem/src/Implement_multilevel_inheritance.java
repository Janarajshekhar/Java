import java.util.Scanner;
class setLengthWidth{
    int length,width;
    public void length_width(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length : ");
        length=sc.nextInt();
        System.out.println("Enter width : ");
        width=sc.nextInt();
    }
}
class calculateArea extends setLengthWidth{
    int a;
    void area(){
        a=length*width;
    }
}
class calculatePerimeter extends calculateArea{
    void Perimeter(){
        int b=2*(length+width);
        System.out.println("Perimeter = "+b);
        System.out.println("Area = "+a);
    }
}
public class Implement_multilevel_inheritance {
    public static void main(String []args){
        calculatePerimeter k=new calculatePerimeter();
        k.length_width();
        k.area();
        k.Perimeter();
    }
}
