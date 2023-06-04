package example_2;
import java.util.Scanner;
public class result {
	
		public static void main(String[] args)
		{
		 //   int maths=93,sci=95,eng=86,phy=85;
		
			
		    try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Enter marks of maths :");
				int maths = scanner.nextInt();
				
				System.out.print("Enter marks of Science :");
				int sci = scanner.nextInt();
				
				System.out.print("Enter marks of English :");
				int eng = scanner.nextInt();
				
				System.out.print("Enter marks of Physics :");
				int phy = scanner.nextInt();
				
				int sum=maths+sci+eng+phy;
				int avg=sum/4;
				System.out.println(sum);
				System.out.println(avg);
				
				if(avg>90)
				{
				  System.out.println("Grade A");
				}
				else if(avg>80)
				{
				  System.out.println("Grade B");
				}
				else if(avg>70)
				{
				  System.out.println("Grade C");
				}
				else
				{
				  System.out.println("FAIL");
				}
			}
		    
		}
}

