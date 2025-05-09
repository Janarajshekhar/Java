package Assignment_8;

class Account{
    private String accountNumber;
    private String customerName;
    private Double balance;
    private static float rateOfInterest;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }
    public double calculateSimpleInterest(int time){
        return (balance*rateOfInterest*time)/100.0;
    }
}
public class Question_1 {
    public static void main(String []args){
        Account A=new Account();
        A.setAccountNumber("23568467fh556");
        A.setCustomerName("Rajshekhar jana");
        A.setBalance(30059.87);
        A.setRateOfInterest(3.5f);
        System.out.println("Account Number : "+A.getAccountNumber());
        System.out.println("Customer Name : "+A.getCustomerName());
        System.out.println("Balance : "+A.getBalance());
        System.out.println("Rate Of Interest : "+A.getRateOfInterest());
        System.out.println("Simple Interest : "+A.calculateSimpleInterest(7));
    }
}
