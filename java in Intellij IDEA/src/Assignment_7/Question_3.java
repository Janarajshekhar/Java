package Assignment_7;

public class Question_3 {
    public static void main(String []args){
        Cuboid C=new Cuboid();
        C.setLength(5);
        C.setBreadth(8);
        C.setHeight(7);
        System.out.println("Length = "+C.getLength());
        System.out.println("Breadth = "+C.getBreadth());
        System.out.println("Height = "+C.getHeight());
        System.out.println("Volume = "+C.volume());
        System.out.println("Surface area = "+C.surfaceArea());
    }
}
class Cuboid{
    private int length,breadth,height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int volume(){
        return length*breadth*height;
    }
    public int surfaceArea(){
        return 2*(length*breadth+breadth*height+height*length);
    }
}
