
public class Square extends TwoDShape{
	public Square(double l, int j) {
		// TODO Auto-generated constructor stub
		length= l;
	    shapeType=2;

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area = length*length; 
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return perimeter = length * 4;
	}

	@Override
	public void display() {		
		   System.out.println("The area of the square is "+ getArea());
		   System.out.println("The perimeter of the square is "+ getPerimeter());
		   System.out.println();


		// TODO Auto-generated method stub
		
	}

}
