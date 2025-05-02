import java.util.Scanner;
public class Sum_of_two_number_using_method {
    Scanner sc=new Scanner(System.in);
    void sum(){
        System.out.println("Enter two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum = "+c);
    }
    public static void main(String []args){
        Sum_of_two_number_using_method k=new Sum_of_two_number_using_method();
        k.sum();
    }
}
