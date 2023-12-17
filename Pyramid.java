
public class Pyramid extends ThreeDShape {

	public Pyramid(double l, double h, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=11;

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area= (Math.pow(length, 2)+(PI* Math.sqrt((Math.pow(length/4,2)+Math.pow(height,2)))));
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume = (1/3)* length* height;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("The area of the Cube is "+ getArea());
		System.out.println("The volume of the Cube is "+ getVolume());
		System.out.println();	
	}

}
