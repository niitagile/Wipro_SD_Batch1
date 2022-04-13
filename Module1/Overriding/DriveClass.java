package Overriding;

public class DriveClass {

	public static void main(String[] args) {
		//Microwave micro=new Microwave(); Can't create Object of Abstract Class
		Microwave micro=new Sandwitch();// Dynamic Dispatching-When you put chicl class Object in Parent reference object , it allows to call only Overriden methods and parent class methods 
		micro.setTemperature();
		//micro.cookSandwitch();// you can't call cookSandwitch as it is not part of microwave
		
		
		FrenchFries ff=new FrenchFries();
		ff.setTemperature();
		ff.cookFrenchFries();

	}

}
