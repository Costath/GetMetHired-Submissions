package Assignment4;

public class Car{
	public Car(int doors, String name, Boolean isEngineOn) {
		this.doors = doors;
		this.name = name;
		this.isEngineOn = isEngineOn;
	}
	
	int doors;
	Boolean isEngineOn;
	String wheels;
	String name;
	String color;
	String transmission;
	
	public int getDoors() {
		return this.doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public Boolean getEngineStatus() {
		return this.isEngineOn;
	}
	
	public void setEngineStatus(Boolean isEngineOn) {
		this.isEngineOn = isEngineOn;
	}
	
	public String getWheels() {
		return this.wheels;
	}
	
	public void setWheels(String wheels) {
		this.wheels = wheels;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTransmission() {
		return this.transmission;
	}
	
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	public void startEngine() {
		setEngineStatus(true);
		System.out.print("Engine started");
	}
	
	public void accelerate() {
		System.out.print("Accelerating");
	}
	
	public void brake() {
		System.out.print("Braking");
	}
	
	public void leftTurnSignal() {
		System.out.print("Left light on");
	}

	public void rightTurnSignal() {
		System.out.print("Right light on");
	}
	
	public void turnRadioOn() {
		System.out.print("Radio on");
	}
	
	public void turnRadioOff() {
		System.out.print("Radio off");
	}
}


/*
 * (a) Explain how you showed inheritance.
 * 		Inheritance can be seen when the three subclasses extended the call Car and were able to access the 
 * 		methods and data members (properties) of the class Car
 * 
 * (b) Separately explain how you showed polymorphism.
 * 		An example of polymorphism is when I overrode methods of the Car class in the subclasses, allowing
 * 		to have multiple methods with the same name but different functionalities
 * 
 * */



