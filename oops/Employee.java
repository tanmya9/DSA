class Employee
{
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public int getId()
	{
		return employee_id;
	}
	public void setId(int eid)
	{
		this.employee_id=eid;
	}
	
	public String getName()
	{
		 return employee_name;
	}
	public void setName(String n)
	{
		 this.employee_name=n;
	}
	
	public double getSalary()
	{
		return employee_salary;
	}
	public void setSalary(double employeeSal)
	{
		this.employee_salary=employeeSal;
	}
	public String getFormattedSalary()
	{
		return String.format("Rs "+ employee_salary);
	}
	
	public static void main(String args[])
	{
		Employee ab=new Employee();
		ab.setId(3213213);       //Setting values
		ab.setName("Tanmya");	
		ab.setSalary(98000);
		
		ab.getId();				//Getting values
		ab.getName();
		ab.getSalary();
		
		int id=ab.getId();		//assigning variables because the value was returned
		String n=ab.getName();
		String sal=ab.getFormattedSalary();
		
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+n);
		System.out.println("Employee Salary: "+sal);
	}
}