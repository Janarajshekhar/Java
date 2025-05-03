package Assignment_7;

public class Question_1 {
    public static void main(String []args){
        Complex C=new Complex();
        C.setComplex(12,78);
        C.printComplex();
    }
}
class Complex{
    private int real,imaginary;
    public void setComplex(int r,int i){
        real=r;
        imaginary=i;
    }
    public void printComplex(){
        System.out.println(real+" + "+imaginary+"i");
    }
}
