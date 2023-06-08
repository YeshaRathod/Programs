package example_2;

public class test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(10, 12);
		System.out.println("Area of the Rectangle: " + rect.getArea());

		Circle cir = new Circle(5);
		System.out.println("Area of the Circle: " + cir.getArea());
		
		Triangle tri = new Triangle(4,6);
		System.out.println("Area of the Triangle: " + tri.getArea());
	}

}
