import java.util.ArrayList;
import java.util.Scanner;


abstract class Shape {
	
	public abstract void display();

	
	
	
	
	
	protected int shape;
	//setter and getter for shape
	public void setShape(int shape) {
		this.shape = shape;
	}
	public int getShape() {
		return shape;
	}
	//Shape class constructor
	public Shape() {
	
	}
	protected int shapeType;
	
	//setter and getter for shapeType
	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}
	
	public int getShapeType() {
		return shapeType;
	}
	
}
