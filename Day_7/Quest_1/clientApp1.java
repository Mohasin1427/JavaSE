import Emppack.Employee;

public class clientApp1 {
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setName("Ajay");
		e1.setDesig("developer");
		e1.setSalary(40000);
		System.out.println("e1 name= "+ e1.getName());
		System.out.println("e1 desig= "+ e1.getDesig());
		System.out.println("e1 salary= "+e1.getSalary());
		
		Employee e2=new Employee("Vijay","manager",50000);
		System.out.println("e2 name= "+ e2.getName());
		System.out.println("e2 desig= "+ e2.getDesig());
		System.out.println("e2 salary= "+e2.getSalary());
		
	}

}
