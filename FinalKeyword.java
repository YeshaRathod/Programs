
class A1 {
	//final method display
	final void display() {
		System.out.println("this is class A1");
	}
}
//final class B1
final class B1 extends A1 {
	//cannot override final method from class A1
	//void display() {
	//	System.out.println("this is class B1");
	//}
}
//cannot extends the final class
//class C1 extends B1 {
//	
//}


public class FinalKeyword {
	public static void main(String[] args) {
		//final variable
		final int a = 10;
		System.out.println("value of a :"+a);
		//The final local variable is cannot re-assigned, now a has fixed value which cannot be changed.
		//a = 20;
		
	}	
}
