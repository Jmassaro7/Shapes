
public class Cone extends ThreeDShape {

	public Cone(double r, double h, int s) {
		// TODO Auto-generated constructor stub
		shapeType=8;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area = ((PI* Math.pow(radius,2)) + (PI* Math.sqrt((Math.pow(radius,2)+Math.pow(height,2)))));
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume = (PI* Math.pow(radius,2)* height)/3;
	}

	@Override
	public void display() {
		System.out.println("The area of the Cone is "+ getArea());
		System.out.println("The volume of the Cone is "+ getVolume());
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
