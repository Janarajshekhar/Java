import java.util.Scanner;
public class Sum_of_two_number_using_class {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Add A=new Add();
        int c=A.sum(a,b);
        System.out.println("Sum = "+c);
    }
}
class Add{
    int sum(int a,int b){
        return(a+b);
    }
}
