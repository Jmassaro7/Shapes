

public class Cylinder extends ThreeDShape{	
	
	public Cylinder(double r, double h, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=6;

	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area = PI* Math.pow(radius,2);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume = ((PI * 2*radius*height)+(2* PI* Math.pow(radius,2)));
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Cylinder is "+ getArea());
		System.out.println("The volume of the Cylinder is "+ getVolume());
		System.out.println();
		
	}
	
}
	
