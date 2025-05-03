package Assignment_7;

public class Question_4 {
    public static void main(String []args){
        Employee E=new Employee();
        E.setEmpId(1);
        E.setName("Rajshekhar jana");
        E.setSalary(60000);
        System.out.println("Employee Id = "+E.getEmpId());
        System.out.println("Employee Name = "+E.getName());
        System.out.println("Employee Salary = "+E.getSalary());
    }
}
class Employee{
    private int empId;
    private String name;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
