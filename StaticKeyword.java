//outer class
class EmployeeDetails {
	String name;  
	static String companyName;  //static variable
	
	//static Block
	static {
		companyName = "LJ";
	}
	
	void display() {
		System.out.println(name+" is employee of "+companyName);
	}
	
	//static Nested Class
	static class Manager {
		//static method
		static void displayCompany() {
			//Cannot make a static reference to the non-static field name
			//System.out.println("employee name is "+name);
			System.out.println("company name is "+companyName);
		}
	}
}


public class StaticKeyword {
	//static method
	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails();
		e1.name = "Ram";
		e1.display();
		//we can initialize the static variable by direct using className
		EmployeeDetails.companyName = "NewLJ";
		e1.display();
		
		//nested class
		//EmployeeDetails.Manager m1 = new EmployeeDetails.Manager();
		EmployeeDetails.Manager.displayCompany();
	}
}
