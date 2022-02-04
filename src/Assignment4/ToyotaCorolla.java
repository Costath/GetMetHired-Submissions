package Assignment4;

public class ToyotaCorolla extends Car{
	public ToyotaCorolla(int doors, String name, Boolean isEngineOn) {
		super(doors, name, isEngineOn);
		
		this.year = 2020;
		this.isUsed = true;
	}
	
	int year;
	Boolean isUsed;
	
	public void TurnHeaterOn() {
		System.out.print("Heater started");
	}

	public void TurnHeaterOff() {
		System.out.print("Heater stopped");
	}
	
	@Override
	public void startEngine() {
		setEngineStatus(true);
		System.out.print("The engine of your " + this.name + " has started");
	}
	
	@Override
	public void leftTurnSignal() {
		System.out.print("Left light on, left camera on");
	}

	@Override
	public void rightTurnSignal() {
		System.out.print("Right light on, right camera on");
	}
}
