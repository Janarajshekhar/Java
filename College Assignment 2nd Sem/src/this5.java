
class area_{
    double width,height,area;
    void setWidth(double width){
        this.width=width;
    }
    void setHeight(double height){
        this.height=height;
    }
    double calculateArea(){
        this.area=this.width*this.height;
        return this.area;
    }
}
public class this5 {

    public static void main(String[] args) {
        area_ a=new area_();
        a.setWidth(5.0);
        a.setHeight(10.0);
        System.out.println("Area of Rectangle = "+a.calculateArea());
    }
}
