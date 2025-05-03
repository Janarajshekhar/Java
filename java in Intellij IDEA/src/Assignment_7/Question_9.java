package Assignment_7;

public class Question_9 {
    public static void main(String []args){
        Circle C=new Circle();
        C.setRadius(5);
        System.out.println("Area = "+C.getArea());
        System.out.println("Circumference = "+C.getCircumference());
    }
}
class Circle{
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea(){
        return 3.14f*radius*radius;
    }

    public float getCircumference(){
        return 2*3.14f*radius;
    }
}
