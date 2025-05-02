import java.util.Scanner;
public class Shape {
    void calculate_Area(float length,float width){
        float result=length*width;
        System.out.println("Area of rectangle is = "+result);
    }
    void calculate_Area(float squareLength){
        float result=squareLength*squareLength;
        System.out.println("Area of square is = "+result);
    }
    void calculate_Area(float radius,boolean isredius){
        float result=(float)(3.14)*radius*radius;
        System.out.println("Area of circle is = "+result);
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Calculate Area of rectangle");
        System.out.println("2. Calculate Area of square");
        System.out.println("3. Calculate Area of circle");
        System.out.println("Enter your choice : ");
        int a=sc.nextInt();
        Shape k=new Shape();
        switch(a){
            case 1:
                System.out.println("Enter length and width (rectangle) : ");
                float length=sc.nextFloat();
                float width=sc.nextFloat();
                k.calculate_Area(length,width);
                break;
            case 2:
                System.out.println("Enter length (square) : ");
                float squareLength=sc.nextFloat();
                k.calculate_Area(squareLength);
                break;
            case 3:
                System.out.println("Enter radius (circle) : ");
                float radius=sc.nextFloat();
                k.calculate_Area(radius,true);
                break;
            default:
                System.out.println("Enter correct choice");
        }
    }
}
