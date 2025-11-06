package oops;

class Shape{
	double dim1,dim2;
	Shape(double dim1, double dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	double area()
	{
		System.out.println("Aread is Undefined!!");
		return 0;
	}
}

class Rectangle extends Shape
{
	Rectangle(double d1,double d2){
	super(d1,d2);
	}
	double area()
	{
		return dim1*dim2;
	}
}

class Triangle extends Shape
{
	Triangle(double d1,double d2){
		super(d1,d2);
	}
	double area() {
		return dim1*dim2/2;
	}
}

public class Overriding{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(30,20);
		System.out.println("Area of Rectangle is: "+rec.area());
		Triangle tri = new Triangle(30,20);
		System.out.println("Area of Triangle is: "+tri.area());
		Shape s1 = new Shape(30,20);
		System.out.println("Area of Shape: " + s1.area());
	}
}