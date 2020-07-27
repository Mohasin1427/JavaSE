package studpack;

public class Student {

	private String name;
	private String address;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name set the student name
	 * @param address set the student address
	 * @param age set the student age
	 */
	public Student(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	/**
	 * @return name get the student name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name name set the student name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return name get the student address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address name set the student address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return name get the student age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age name set the student age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
