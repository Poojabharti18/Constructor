package constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee a1=new Employee(1002,"Pooja",45000);
		System.out.println(a1.toString());
		System.out.println("======================================");
		Employee q1=new Employee(1002,"Ravi",50000);
		System.out.println(q1.toString());
		System.out.println("======================================");

	}

}
