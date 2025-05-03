package Assignment_7;

public class Question_8 {
    public static void main(String []args){
        Distance A=new Distance();
        Distance B=new Distance();
        Distance C;
        A.setDistance(5,80,50);
        B.setDistance(3,30,70);
        C=A.addDistance(B);
        C.displayDistance();
    }
}
class Distance{
    private int km,m,cm;
    public void setDistance(int x,int y,int z){
        km=x;
        m=y;
        cm=z;
    }
    public void displayDistance(){
        System.out.println(km+" km "+m+" m "+cm+" cm");
    }
    public Distance addDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100 +m+d.m;
        temp.cm=temp.cm%100;
        temp.km=temp.m/1000 +km+d.km;
        temp.m=temp.m%1000;
        return temp;
    }
}
