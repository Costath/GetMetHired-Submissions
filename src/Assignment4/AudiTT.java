package Assignment4;

public class AudiTT extends Car {
	public AudiTT(int doors, String name, Boolean isEngineOn) {
		super(doors, name, isEngineOn);
		
		this.convertible = true;
		this.color = "blue"; 
	}
	
	Boolean convertible;
	String color;
	
	public void retractRoof() {
		System.out.print("Roof retracted");
	}

	public void extendRoof() {
		System.out.print("Roof extended");
	}
	
	@Override
	public void turnRadioOn() {
		System.out.print("Radio on, select the station");
	}
}
