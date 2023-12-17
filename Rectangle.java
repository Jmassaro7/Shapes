
public class Rectangle extends TwoDShape{

	public Rectangle(double l, double w, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=3;

	}

	@Override
	public double getArea() {
		return area = length*width; 

		// TODO Auto-generated method stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return perimeter = (2*length + 2*width);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Rectangle is "+ getArea());
		System.out.println("The perimeter of the Rectangle is "+ getPerimeter());
		System.out.println();

	}

}
