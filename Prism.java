
public class Prism extends ThreeDShape {

	public Prism(double l, double h, double w, int j) {
		// TODO Auto-generated constructor stub
	      shapeType=10;

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area = (length*width)+(3*length*height);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume = length*height;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The area of the Prism is "+ getArea());
		System.out.println("The volume of the Prism is "+ getVolume());
		System.out.println();		
	}

}
