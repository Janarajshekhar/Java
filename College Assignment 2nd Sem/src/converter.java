import java.util.Scanner;
public class converter {
    void convert_Temperature(float celsius){
        float F;
        F=(celsius*9/5)+32;
        System.out.println("Fahrenheit = "+F);
    }

    void convert_Temperature(float fahrenheit, boolean isFahrenheit){
        float C;
        C=((fahrenheit-32)*5)/9;
        System.out.println("celsius = "+C);
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. convert celsius to fahrenheit");
        System.out.println("2. convert fahrenheit to celsius");
        System.out.println("Enter your choice : ");
        int a=sc.nextInt();
        converter k=new converter();
        switch (a){
            case 1 :
                System.out.println("Enter celsius temperature : ");
                float celsius=sc.nextFloat();
                k.convert_Temperature(celsius);
                break;
            case 2 :
                System.out.println("Enter fahrenheit temperature : ");
                float fahrenheit=sc.nextFloat();
                k.convert_Temperature(fahrenheit,true);
                break;
            default :
                System.out.println("Enter correct choice");
        }
    }
}
