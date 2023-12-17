
public class Sphere extends ThreeDShape{

	@Override
	public double getArea() {
			// TODO Auto-generated method stub
		return area = 4*PI* Math.pow(radius,2);
	
		}

		@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume = (4/3)*PI* Math.pow(radius,3);

		}
		

	public Sphere(double i, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=7;

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Sphere is "+ getArea());
		System.out.println("The volume of the Sphere is "+ getVolume());
		System.out.println();

	}
}


