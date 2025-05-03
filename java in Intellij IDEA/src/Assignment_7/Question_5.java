package Assignment_7;

public class Question_5 {
    public static void main(String []args){
        Contact C=new Contact();
        C.setId(2);
        C.setFirstName("Rajshekhar");
        C.setLastName("Jana");
        C.setMobileNo("1234567890");
        C.setEmailId("gvsddkkdf567@gmaul.com");
        System.out.println("Id = "+C.getId());
        System.out.println("First Name = "+C.getFirstName());
        System.out.println("Last Name = "+C.getLastName());
        System.out.println("Mobile No = "+C.getMobileNo());
        System.out.println("Email Id = "+C.getEmailId());
    }
}
class Contact{
    private int id;
    private String firstName,lastName,mobileNo,emailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
