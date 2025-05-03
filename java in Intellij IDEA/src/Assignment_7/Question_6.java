package Assignment_7;

public class Question_6 {
    public static void main(String []args){
        Question Q=new Question();
        Q.setQuestion(1,"Your favourite programming language","C","c++","java","python",'c');
        Q.displayQuestion();
    }
}
class Question{
    private int queNo;
    private String que,optionA,optionB,optionC,optionD;
    private char answer;
    public void setQuestion(int qno,String q,String a,String b,String c,String d,char ans){
        queNo=qno;
        que=q;
        optionA=a;
        optionB=b;
        optionC=c;
        optionD=d;
        answer=ans;
    }
    public void displayQuestion(){
        System.out.println(queNo+" . "+que);
        System.out.println("(a) "+optionA);
        System.out.println("(b) "+optionB);
        System.out.println("(c) "+optionC);
        System.out.println("(d) "+optionD);
        System.out.println("Answer : "+answer);
    }
}
