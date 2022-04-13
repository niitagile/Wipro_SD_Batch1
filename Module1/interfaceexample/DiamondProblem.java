package interfaceexample;
interface Parent1{
	void show() ;
	
}

interface Parent2{
		void show() ;
}
		
class child implements Parent1,Parent2{
		void display() {
			
		}

		@Override
		public void show() {
			System.out.println("show method");
			
		}
		
		
}
public class DiamondProblem {

	public static void main(String[] args) {
		child c=new child();
		c.show();

	}

}
