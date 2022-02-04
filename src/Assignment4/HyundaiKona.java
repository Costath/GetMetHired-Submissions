package Assignment4;

public class HyundaiKona extends Car{
	public HyundaiKona(int doors, String name, Boolean isEngineOn) {
		super(doors, name, isEngineOn);
		
		this.isHybrid = false;
		this.hasMetallicPaiting = true;
	}

	Boolean isHybrid;
	Boolean hasMetallicPaiting;
	
	public void LowerWindow(String window) {
		System.out.print(window + "window lowered");
	}
	
	public void LiftWindow(String window) {
		System.out.print(window + "window lifted");
	}
	
	@Override
	public void brake() {
		System.out.print("Braking");
		System.out.print("1/n 2/n 3/n");
		System.out.print("Car stopped");
	}
}
