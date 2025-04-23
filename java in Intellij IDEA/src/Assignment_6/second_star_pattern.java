package Assignment_6;

public class second_star_pattern {
    public static void main(String []args){
        int i,j;
        for(i=1;i<=5;i++) {
            for (j = 1; j <= 5; j++) {
                if (j >= (5+1)-i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println(" ");
        }
    }
}
