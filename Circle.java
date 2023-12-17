
public class Circle extends TwoDShape{
	  
		private final static double PI=3.14; 

		private double radius;

		 public void setRadius(double r) {
		      this.radius = r;
		   }
		 public double getRadius() 
		   {
		       return radius;
		   }
		 
		 public Circle (double r, int s){ 
		      shapeType=1;
		    }
		
		public void display() {
			   System.out.println("The area of the circle is "+ getArea());
			   System.out.println("The circumfrance is "+ getPerimeter());
			   System.out.println();

		}
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return area= PI * Math.pow(radius,2);
		}

		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return perimeter = PI*radius;
			}

		
}

