package Assignment3;

public class Rectangle extends Shape implements Resizable {	
	public Rectangle(int width, int height) {
		super(4);
		
		this.width = width;
		this.height = height;		
	}
	
	double width;
	double height;
	
	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return (this.width + this.height) * 2;
	}
	
	public void resize(double x) {
		this.width *= x;
		this.height *= x;
	}
	
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(2, 3);
		
		System.out.println("The area of the rectangle is: " + rectangle.getArea());
		System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
		
		System.out.println("\nResizing the Rectangle by factor of 2\n");
		rectangle.resize(2);
		
		System.out.println("The area of the rectangle is: " + rectangle.getArea());
		System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
	
	}
}
