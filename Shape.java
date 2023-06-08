package example_2;

public interface Shape{
     double getArea();
}
class Rectangle implements Shape{
		int l;
		int b;
		public Rectangle(int l,int b)
		{
			this.l=l;
			this.b=b;
		}
		@Override
		public double getArea()
		{	
		return l*b;
	    }
}

class Circle implements Shape{
	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	@Override
	public double getArea()
	{	
	return 3.14*r*r;
    }
}

class Triangle implements Shape{
	double base;
	double height;
	public Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	@Override
	public double getArea()
	{	
	return (base*height)/2;
    }
}