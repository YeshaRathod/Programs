package prac;

public class Employee {
		 private String name;
		    private int yearOfJoining;
		    private double salary;
		    private String address;
		    

		    public Employee(String name, int yearOfJoining, double salary, String address) 
		 {
		        this.name = name;
		        this.yearOfJoining = yearOfJoining;
		        this.salary = salary;
		        this.address = address;
	     }
		    public String getName() {
		    	return name;
		    }
		    public int getYearOfJoining() {
		    	return yearOfJoining;
		    }
		    public double getSalary() {
		    	return salary;
		    }
		    public String getAddress() {
		        return address;
		    }
	


	
		public static void main(String[] args) {
			
			Employee emp1 = new Employee("Robert", 1994, 50000,  "64C-WallsStreat");
			Employee emp2 = new Employee("Sam", 2000, 60000, "68D-WallsStreat");
			Employee emp3 = new Employee("John", 1999, 80000, "26B-WallsStreat");
			
			  System.out.println("Name\tYear of Joining\tAddress");
		        System.out.println(emp1.getName() + "\t" + emp1.getYearOfJoining() + "\t" + emp1.getAddress());
		        System.out.println(emp2.getName() + "\t" + emp2.getYearOfJoining() + "\t" + emp2.getAddress());
		        System.out.println(emp3.getName() + "\t" + emp3.getYearOfJoining() + "\t" + emp3.getAddress());
		}
	}


