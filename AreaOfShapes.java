import java.util.Scanner;

public class AreaOfShapes {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the sides");
		int sides=sc.nextInt();
		
		if(sides==0) {
			System.out.println("Enter the radius");
			double radius=sc.nextDouble();
			
			double area=areaOfCircle(radius);
			
			System.out.printf("Area of the Circle is %.2f",area);
		}
		else if(sides==3) {
			System.out.println("Enter the base and height");
			double base=sc.nextDouble();
			double height=sc.nextDouble();
			
			double area=areaOfTriangle(height,base);
			
			System.out.printf("Area of the Triangle is %.2f",area);
		}
		else if(sides==4) {
			System.out.println("Enter the length");
			double length=sc.nextDouble();
			
			System.out.println("Enter the breadth");
			double breadth=sc.nextDouble();
			
			if(length==breadth) {
				double area=areaOfRectangleOrSquare(length,breadth);
				System.out.printf("Area of the Square is %.2f",area);
			}
			else {
			double area=areaOfRectangleOrSquare(length,breadth);
			System.out.printf("Area of the Rectangle is %.2f",area);
			}
		}
		else {
			System.out.println("Invalid side");
		}
		
	}
	
	static double areaOfCircle(double radius) {
		return radius*radius*3.14;
	}
	
	static double areaOfTriangle(double height,double base) {
		return (base*height)/2;
	}
	
	static double areaOfRectangleOrSquare(double length,double breadth) {
		return length*breadth;
	}
	

}
