package Assignment8;

class TraficLights {
	boolean isGreen = false;
	
	synchronized void setTrafficLightRed() {
		if(!this.isGreen) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.isGreen = false;
		System.out.println("Red light");
		notify();		
		
	}
	
	synchronized void setTrafficLightGreen() {
		if(this.isGreen) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.isGreen = true;
		System.out.println("Green light");
		notify();
	}
}

class TurnLightRed extends Thread {
	TraficLights traficLights;
	
	TurnLightRed(TraficLights traficLights){
		this.traficLights = traficLights;
		this.start();
	}
	
	@Override
	public void run() {		
		for(int i = 1; i <= 6 ; i++) {
			traficLights.setTrafficLightRed();
		}
	}
}

class TurnLightGreen extends Thread {
	TraficLights traficLights;
	
	TurnLightGreen(TraficLights traficlights){
		this.traficLights = traficlights;
		this.start();
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 6 ; i++) {
			traficLights.setTrafficLightGreen();
		}
	}
}


public class InterThreadComms {
	public static void main (String args[]) {
		TraficLights traficLights = new TraficLights();
		new TurnLightRed(traficLights);
		new TurnLightGreen(traficLights);
	}
}
