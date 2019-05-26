
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("Joyce", 38409, "Pampanga", 30.00);
	//	employee1.setName("Joyce");
	//	employee1.setaddress("Pampanga");
		//employee1.setSalary(30.00);
		//employee1.setEmployeeID(38409);
		
		System.out.println(employee1.getSalary());
		employee1.setSalary(50.00);
		
		
		
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getAddress());
		System.out.println(employee1.getName());
		System.out.println(employee1.getEmployeeID());
		
		Employee employee2 = new Employee("Tan", 156165, "las Pinas", 500.00);
		
		System.out.println(employee2.getSalary());
		System.out.println(employee2.getAddress());
		System.out.println(employee2.getName());
		System.out.println(employee2.getEmployeeID());
		
	}
}

