package Assignment_7;

public class Question_2 {
    public static void main(String []args){
        Time T=new Time();
        T.setTime(3,45,20);
        T.showTime();
    }
}
class Time{
    private int hr,min,sec;
    public void setTime(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    public void showTime(){
        System.out.println(hr+" hr "+min+" min "+sec+" sec");
    }
}