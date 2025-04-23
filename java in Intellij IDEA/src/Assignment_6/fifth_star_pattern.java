package Assignment_6;

public class fifth_star_pattern {
    public static void main(String []args){
        int i,j;
        for(i=1;i<=5;i++) {
            for (j = 1; j <= 5; j++) {
                if (j <= i)
                    System.out.print(" "+j+" ");
                else
                    System.out.print("   ");
            }
            System.out.println(" ");
        }
    }
}
