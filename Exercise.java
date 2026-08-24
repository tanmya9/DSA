class Employee
{
    private String name;
    private Double salary;
    Employee(String name, Double salary)
    {
        this.name=name; //refers to the current instance's fields
        this.salary=salary;
    }
    
    //without constructor - using setter methods to set and access values
    // public void setName(String name)
    // {
    //     this.name=name;
    // }
    // public void setSalary(Double salary)
    // {
    //     this.salary=salary;
    // }
    public String getDetails()
    {
        return "Name: "+name+ " ,Salary: "+salary;
    }
    
    public String getName()
    {
        return name;        
    }
    public double getSalary()
    {
        return salary;        
    }
}
    
class Manager extends Employee
{
    private String department;
    
    Manager(String name, double salary, String department)
    {
        super(name, salary); //to call parent constructor
        this.department=department;
    }
    
    @Override
    public String getDetails()
    {
        return super.getDetails()+ " ,Department: "+department;
    }
}
public class Exercise{
    public static void main(String args[])
    {
        Employee obj1=new Employee("Alice", 50000.0);
        Employee obj2=new Manager("Bob", 80000.0, "IT");
        
        // obj1.setName("Alice");
        // obj1.setSalary(50000);
        // System.out.println(obj1.getName());
        // System.out.println(obj1.getSalary());
        
        System.out.println(obj1.getDetails());
        System.out.println(obj2.getDetails());
    }    
}