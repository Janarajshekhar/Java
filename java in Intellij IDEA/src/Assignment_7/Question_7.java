package Assignment_7;

public class Question_7 {
    public static void main(String []args){
        Course C=new Course();
        C.setCourseId(5);
        C.setCourseName("BCA");
        C.setDuration("4 year");
        C.setFee(90000);
        System.out.println("Course Id : "+C.getCourseId());
        System.out.println("Course Name : "+C.getCourseName());
        System.out.println("Course Duration : "+C.getDuration());
        System.out.println("Course fee : "+C.getFee());
    }
}
class Course{
    private int courseId;
    private String courseName,duration;
    private double fee;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
