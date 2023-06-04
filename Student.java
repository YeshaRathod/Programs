package example_2;
import java.util.Scanner;

public class Student {
	public static void main(String[] args)
	{
		Student_1 stu = new Student_1();
		stu.getData();
		System.out.print("DETAILS");
		stu.Display();
	}

}
class Student_1{
	String name;
	int id;
	int age;
	int mobileno;
	
	void getData()
	{
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Name = ");
			name = scanner.nextLine();
			
			System.out.print("ID = ");
			id = scanner.nextInt();
			
			System.out.print("Age = ");
			age = scanner.nextInt();
			
			System.out.print("Mobile No = ");
			mobileno = scanner.nextInt();
		}
	
	}
	void Display()
	{
		System.out.print("Name : "+ name);
		System.out.print("ID : "+ id);
		System.out.print("Age : "+ age);
		System.out.print("MobileNo : "+ mobileno);
	}
	
}
