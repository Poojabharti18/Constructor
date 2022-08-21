package constructor;

public class Employee {
	private int id;
	private String name;
	private float salary;
	
	public Employee()//default
	{
		
	}
	public Employee(int id,String name,float salary)
	{
		id=id;
		name=name;
		salary=salary;
	}
	public double annualsalary()
	{
		double annualsalary=salary*12;
		return annualsalary;
	}

	
	public String toString()
	{
		return "ID=:"+id+"Name=:"+name+"Salary=:"+salary+"AnnualSalary"+annualsalary();
	}
}