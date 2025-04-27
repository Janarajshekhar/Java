package Assignment_6;

public class ninth_star_pattern {
    public static void main(String []args){
        int i,j;
        char k=64;
        for(i=1;i<=5;i++) {
            k=(char)(64+i);
            for (j = 1; j <= 5; j++) {
                if (j >= i) {
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
