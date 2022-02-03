package Assignment3;

abstract class Shape {
	int numSides;
	
	public Shape(int numSides){
		this.numSides = numSides;
	};
	
	public int getNumSides() {
		return this.numSides;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}