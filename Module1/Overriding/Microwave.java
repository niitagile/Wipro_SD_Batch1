package Overriding;

abstract  class Microwave {
	
	void useMicrowave() {
		System.out.println("start/stop");
	}
	// a method which is declared in parent class but define in child class
	abstract void setTemperature() ;

}

class Sandwitch extends Microwave{
	
	void cookSandwitch() {
		useMicrowave();
		setTemperature();
	}
	
	@Override //annotation- special instruction for compiler
	void setTemperature() {
		System.out.println("40 Degree");
	}
}

class FrenchFries extends Microwave{
	
	void cookFrenchFries() {
		useMicrowave();
		setTemperature();
	}
	@Override
	void setTemperature() {
		System.out.println("180 Degree");
	}
}
