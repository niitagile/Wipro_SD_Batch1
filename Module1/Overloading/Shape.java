package Overloading;

public class Shape {
	void area(int l){
		System.out.println("area ="+(l*l));
	}
	void area(float r) {
		System.out.println("area="+(3.14*r*r));
		
	}
	void area(int l, int b) {
		System.out.println("area="+(l*b));
	}
	
	
}
