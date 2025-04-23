package Assignment_6;

public class sixth_star_pattern {
    public static void main(String []args){
        int i,j;
        for(i = 1;i <= 4; i++) {
            for (j = i; j >= 1; j--) {
                if (j <= i)
                        System.out.print(" "+j+" ");
                else
                    System.out.print("   ");
            }
            System.out.println(" ");
        }
    }
}
