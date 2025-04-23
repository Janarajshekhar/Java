package Assignment_6;

public class seventh_star_pattern {
    public static void main(String []args){
        int i,j;
        char k;
        for(i=1;i<=5;i++) {
            k='A';
            for (j = 1; j <= 5; j++) {
                if(j >= i) {
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
