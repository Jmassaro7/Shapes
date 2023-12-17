
public class Triangle extends TwoDShape{

	public Triangle(double l, double w, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=4;

	}

	@Override
	public double getArea() {
		return area = .5*length*width; 
		
		// TODO Auto-generated method stub
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return perimeter = (2*length + width);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Triangle is "+ getArea());
		System.out.println("The perimeter of the Triangle is "+ getPerimeter());
		System.out.println();

			// TODO Auto-generated constructor stub
	}

}
