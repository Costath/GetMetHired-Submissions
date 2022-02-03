package Assignment3;

public class RtTriangle extends Shape{
	public RtTriangle(int width, int height) {
		super(3);
		
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
}