import java.util.Scanner;
class A{
    int l,w;
    public void length_width(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length : ");
        l=sc.nextInt();
        System.out.println("Enter width : ");
        w=sc.nextInt();
    }
}
class B extends A{
    void Area(){
        int a=l*w;
        System.out.println("Area = "+a);
    }
}
public class Implement_single_inheritance {
    public static void main(String []args){
        B a=new B();
        a.length_width();
        a.Area();
    }
}
