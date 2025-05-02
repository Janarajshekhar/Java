public class Sum_of_n_number_using_CLA {
    public static void main(String []args){
        int sum=0;
        if(args.length==0)
            System.out.println("Please provide number as command line arguments");
        else {
            System.out.print("Argument is : ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i] + " ");
                sum = sum + Integer.parseInt(args[i]);
            }
            System.out.println();
            System.out.println("Sum = " + sum);
        }
    }
}
