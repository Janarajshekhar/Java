package Assignment_6;

public class eighth_star_pattern {
    public static void main(String []args){
        int i,j,k=1;
        for(i = 1;i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                if (j <= i){
                    System.out.print(" " + k + " ");
                    k++;
                }
                else
                    System.out.print("   ");
            }
            System.out.println(" ");
        }
    }
}
