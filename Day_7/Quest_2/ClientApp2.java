import Emppack.Employee;
import studpack.Student;

public class ClientApp2 {

	public static void main(String args[])
	{
		Student s1=new Student();
		
		s1.setName("Ram");
		s1.setAddress("Goa");
		s1.setAge(20);
		System.out.println("s1 name="+s1.getName());
		System.out.println("s1 address="+ s1.getAddress());
		System.out.println("s1 age="+ s1.getAge());
		
		Student s2=new Student("shyam","Mumbai",21);
		System.out.println("s2 name="+s2.getName());
		System.out.println("s2 address="+ s2.getAddress());
		System.out.println("s2 age="+ s2.getAge());
	}
}
