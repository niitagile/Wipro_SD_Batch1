package LambdaExamples;


import java.util.function.Consumer;
/*interface Consumer<T>{
	void accept(T t);
}*/
public class ConsumerExample {
	static void showDetails(String name){
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//injecting of already existing method
		Consumer<String>biCon=ConsumerExample::showDetails;
		biCon.accept("Neha");
		biCon.accept("Nisha");
		//create new body for method
		Consumer<String> biCon2= (name)->System.out.println(name);
		
		biCon2.accept("Ashish");
		biCon2.accept("Nishant");

	}

}

