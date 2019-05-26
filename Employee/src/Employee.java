
public class Employee {
	private String name;
	private int employeeId;
	private String address;
	private double salary;
	
	public Employee(String name, int employeeId, String address, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.address = address;
		this.salary = salary;
	}
	
	public void setEmployeeID(int setemployeeid) {
		employeeId = setemployeeid;
	}
	public int getEmployeeID() {
		return employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary ;
	}
}
