package Emppack;

public class Employee {
	/**
	 * Default constructor
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name to set the  Employee name
	 * @param desig to set the  Employee designation
	 * @param salary to set the  Employee salary (double)
	 */
	public Employee(String name, String desig, double salary) {
		super();
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	private String name;
	private String desig;
	private double salary;
	/**
	 * ToString Method
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
	
	
	/**
	 * @return to get the  Employee name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name to set the  Employee name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return to get the  Employee designation
	 */
	public String getDesig() {
		return desig;
	}
	/**
	 * @param desig to set the  Employee designation
	 */
	public void setDesig(String desig) {
		this.desig = desig;
	}
	/**
	 * @return to get the  Employee salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary to set the  Employee salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
