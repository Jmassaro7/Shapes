
	public abstract class TwoDShape extends Shape{
	public TwoDShape() {

			// TODO Auto-generated constructor stub
		}


	public double width;
	public double length;
	public double index;
	protected double area;
	protected double perimeter;
		
	private final static double PI=3.14; 

	//abstract methods
	// Setters
	   public void setW(double width){
			this.width = width;
	   }
	   	 	     
	   //Get width
	   public double getWidth() {
	       return width;
	   } 
	   public void setL(double length)
	   {
	      this.length = length;
	   }
	   	 	     
	   //Get width
	   public double getLength() 
	   {
	       return length;
	   } 

	 
	   public abstract double getArea();
		
	   public abstract double getPerimeter();
	
	


}
