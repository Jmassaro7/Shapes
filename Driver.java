/**Assignment 6 inheritance, Abstract class, and Polymorphism
 * Author Jakob Massaro 
 * 
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;



public class Driver {
	// method to initialize list
	private static ArrayList <Shape> shapeList = new ArrayList<>();
	public void initSavingsList() {
		
	}
	//method to find index
	public int findShape(int type) {
		int i=0;
		for (Shape q: shapeList ) {
			if (q.getShapeType()==type)
				return i;
			else
				i++;
		}
		return i;
		
	}
			
			public void addShape(Shape s) {
				shapeList.add(s);	
			}
			public Driver() {
				// TODO Auto-generated constructor stub
			
			}			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner (System.in);
			Driver d = new Driver();
			char toContinue='y';
			int shape;
			int option;
			double i=0;	
			int j=0;
			
			Circle c = new Circle(i,j);
			
			Square s = new Square(i,j);
			Triangle t = new Triangle(i,i,j);
			Parrallellogram p = new Parrallellogram(i,i,j);
			Rectangle r = new Rectangle(i,i,j);
			Cylinder cyl = new Cylinder(i,i,j);
			Cube cub = new Cube(i,j);
			Cone con = new Cone (i,i,j);
			Pyramid pyr = new Pyramid (i,i,j);
			Prism pri = new Prism (i, i, i,j);
			Sphere sph = new Sphere(i,j);;
						
			while (toContinue=='y') {
				//add choice
				System.out.println("Enter 1 for 2D shape or 2 for 3D shape");
				int dimension=input.nextInt();
				
				if (dimension==1) {
					
					System.out.println("Enter:\n1 to add a shape\n2 to display all 2D shapes\n3 to display all 3D shapes\n4 to display all shapes\n5 to display information of a specific shape");
					option=input.nextInt();
					//add shape
					if (option==1) {
						System.out.println("Enter:\n1 for circle\n2 for square\n3 for rectangle\n4 for triangle\n5 for parrallellogram");
						shape=input.nextInt();
						
						
						if (shape==1) {
							System.out.println("Enter the radius: ");
							double radius= input.nextInt();
							c.setRadius(radius);
							d.addShape(c);							
						}
						
						else if (shape==2) {
							System.out.println("Enter the side lenth: ");
							double length= input.nextInt();
							s.setL(length);
							d.addShape(s);		
						
					}
						else if (shape==3) {
							System.out.println("Enter the lenth: ");
							double length= input.nextInt();
							r.setL(length);
							System.out.println("Enter the width: ");
							double width= input.nextInt();
							r.setW(width);
							d.addShape(r);		
						
							
					}
						else if (shape==4) {
							System.out.println("Enter the base: ");
							double length= input.nextInt();
							t.setL(length);
							System.out.println("Enter the height: ");
							double width= input.nextInt();
							t.setW(width);
							d.addShape(t);	
					}
						else if (shape==5) {
							System.out.println("Enter the lenth: ");
							double length= input.nextInt();
							p.setL(length);
							System.out.println("Enter the width: ");
							double width= input.nextInt();
							p.setW(width);
							d.addShape(p);		
						

							
					}
					

					}
					//display 2D
					else if (option==2) {
						for (Shape q: shapeList ) {
							if (q.getShapeType()<6)
								q.display();
							}

					}
					//display 3D
					else if (option==3) {
						for (Shape q: shapeList ) {
							if (q.getShapeType()>5)
								q.display();
						}

					}
					//display all
					else if (option==4) {
						for (Shape q: shapeList ) {
							q.display();
						}
							}
					//display specific
					else if (option==5) {
						System.out.println("Enter:\n1 for circle\n2 for square\n3 for rectangle\n4 for triangle\n5 for parrallellogram");
						int type= input.nextInt();
						int index = d.findShape(type);
						d.shapeList.get(index).display();
					}

	}
				else if (dimension==2) {
					System.out.println("Enter:\n1 to add a shape\n2 to display all 2D shapes\n3 to display all 3D shapes\n4 to display all shapes\n5 to display information of a specific shape");
					option=input.nextInt();
					//add shape
					if (option==1) {
						System.out.println("Enter:\n1 for cylinder\n2 for sphere\n3 for cone\n4 for cube\n5 for prism\n6 for pyramid");
						shape=input.nextInt();
						
						if (shape==1) {
							System.out.println("Enter the radius: ");
							double rad= input.nextInt();
							cyl.setRadius(rad);
							System.out.println("Enter the height: ");
							double h= input.nextInt();
							cyl.setH(h);
							d.addShape(cyl);	
						}
						else if (shape==2) {
							System.out.println("Enter the radius: ");
							double rad= input.nextInt();
							sph.setRadius(rad);
							d.addShape(sph);		
						
					}
						else if (shape==3) {
							System.out.println("Enter the radius: ");
							double rad= input.nextInt();
							con.setRadius(rad);
							System.out.println("Enter the height: ");
							double h= input.nextInt();
							con.setH(h);
							d.addShape(con);		
						
							
					}
						else if (shape==4) {
							System.out.println("Enter the side length: ");
							double length= input.nextInt();
							cub.setL(length);
							d.addShape(cub);	
					}
						else if (shape==5) {
							System.out.println("Enter the lenth: ");
							double length= input.nextInt();
							pri.setL(length);
							System.out.println("Enter the width: ");
							double width= input.nextInt();
							pri.setW(width);
							System.out.println("Enter the height: ");
							double h= input.nextInt();
							pri.setH(h);
							d.addShape(pri);				
					}
						else if (shape==6) {
							System.out.println("Enter the lenth: ");
							double length= input.nextInt();
							pyr.setL(length);
							System.out.println("Enter the height: ");
							double h= input.nextInt();
							pyr.setH(h);
							d.addShape(pyr);

						}
					}
					//display 2D
					else if (option==2) {
						for (Shape q: shapeList ) {
							if (q.getShapeType()<6)
								q.display();
							}

					}
					//display 3D
					else if (option==3) {
						for (Shape q: shapeList ) {
							if (q.getShapeType()>5)
								q.display();
						}
					}
					//display all
					else if (option==4) {
						System.out.println("ALL SHAPES:");
						for (Shape q: shapeList ) {
							q.display();
							
							}
					}
					//display specific
					else if (option==5) {
						System.out.println("Enter:\n6 for cylinder\n7 for sphere\n8 for cone\n9 for cube\n10 for prism\n11 for pyramid");
						int type= input.nextInt();
						int index = d.findShape(type);
						d.shapeList.get(index).display();
						}

					}
				else
					System.out.println("invalid option");
				
			//ask user if they want to continue	
			System.out.println("Would you like to continue? y/n: ");
			toContinue= input.next().charAt(0);
			
			}
			//Quit message
			System.out.println("Good Bye!");
				
				
			}
			
			
		


}

