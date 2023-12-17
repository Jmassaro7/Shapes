
public abstract class ThreeDShape extends Shape{
	//abstract methods
	public double height;
	public double width;
	public double length;
	public double radius;
	protected double area;
	protected double volume;
	public final static double PI=3.14; 

	// Setters and getters
	public void setW(double width){
		this.width = width;
		   }
		   	 	     
	public double getWidth() {
		return width;
		   } 
	public void setH(double h){
		this.height = h;
}
	 	     
	public double getH() {
		return height;
	} 
	public void setL(double length)
	   {
	    this.length = length;
	   }
	   	 	     
	public double getLength() {
		return length;
	   } 
	public void setRadius(double r) {
	    this.radius = r;
	   }
	public double getRadius() 
	   {
	    return radius;
	   }
	
	//abstract methods 
	public abstract double getArea();
		
	public abstract double getVolume();
		
	public ThreeDShape() {
		// TODO Auto-generated constructor stub
	}
	
	
}
