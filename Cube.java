
public class Cube extends ThreeDShape{
	public Cube(double l, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=9;

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area= Math.pow(length, 2)*6;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume= Math.pow(length, 3);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Cube is "+ getArea());
		System.out.println("The volume of the Cube is "+ getVolume());
		System.out.println();	
	}

}
